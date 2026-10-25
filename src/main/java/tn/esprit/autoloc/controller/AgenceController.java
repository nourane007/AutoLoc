package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Agence")
@AllArgsConstructor
@RequestMapping("/agences")
public class AgenceController {
    private final IAgenceService agenceService;
    @GetMapping("/afficherToutesAgences")
    public List<Agence> getAllAgences(){
        return agenceService.afficherToutesAgences();
    }
    @GetMapping("/afficherAgenceById/{id}")
    public Agence getAgenceById(@PathVariable Long id){
        return agenceService.afficherAgenceById(id);
    }
    @PostMapping("/ajouterAgence")
    public Agence ajouterAgence(@RequestBody Agence agence){
        return agenceService.ajouterAgence(agence);
    }
    @PutMapping("/modifierAgence")
    public Agence modifierAgence(@RequestBody Agence agence){
        return agenceService.modifierAgence(agence);
    }
    @DeleteMapping("/supprimerAgence/{idAgence}")
    public void supprimerAgence(@PathVariable Long idAgence){
        agenceService.supprimerAgence(idAgence);
    }
}

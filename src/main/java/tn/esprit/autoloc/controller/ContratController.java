package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Contrat")
@AllArgsConstructor
@RequestMapping("/contrats")
public class ContratController {
    private final IContratService contratService;
    @GetMapping("/afficherTousContrats")
    public List<Contrat> getAllContrats(){
        return contratService.afficherTousContrats();
    }
    @GetMapping("/afficherContratById/{id}")
    public Contrat getContratById(@PathVariable Long id){
        return contratService.afficherContratById(id);
    }
    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat){
        return contratService.ajouterContrat(contrat);
    }
    @PutMapping("/modifierContrat")
    public Contrat modifierContrat(@RequestBody Contrat contrat){
        return contratService.modifierContrat(contrat);
    }
    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id){
        contratService.supprimerContrat(id);
    }
}

package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Paiement")
@AllArgsConstructor
@RequestMapping("/paiements")
public class PaiementController {
    private final IPaiementService paiementService;
    @GetMapping("/afficherTousPaiements")
    public List<Paiement> getAllPaiements(){
        return paiementService.afficherTousPaiements();
    }
    @GetMapping("/afficherPaiementById/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return paiementService.afficherPaiementById(id);
    }
    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement){
        return paiementService.ajouterPaiement(paiement);
    }
    @PutMapping("/modifierPaiement")
    public Paiement modifierPaiement(@RequestBody Paiement paiement){
        return paiementService.modifierPaiement(paiement);
    }
    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id){
        paiementService.supprimerPaiement(id);
    }
}

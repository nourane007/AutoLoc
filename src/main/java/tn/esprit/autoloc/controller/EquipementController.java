package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Equipement")
@AllArgsConstructor
@RequestMapping("/equipements")
public class EquipementController {
    private final IEquipementService equipementService;
    @GetMapping("/afficherTousEquipements")
    public List<Equipement> getAllEquipements(){
        return equipementService.afficherTousEquipements();
    }
    @GetMapping("/afficherEquipementById/{id}")
    public Equipement getEquipementById(@PathVariable Long id){
        return equipementService.afficherEquipementById(id);
    }
    @PostMapping("/ajouterEquipement")
    public Equipement ajouterEquipement(@RequestBody Equipement equipement){
        return equipementService.ajouterEquipement(equipement);
    }
    @PutMapping("/modifierEquipement")
    public Equipement modifierEquipement(@RequestBody Equipement equipement){
        return equipementService.modifierEquipement(equipement);
    }
    @DeleteMapping("/supprimerEquipement/{id}")
    public void supprimerEquipement(@PathVariable Long id){
        equipementService.supprimerEquipement(id);
    }
}

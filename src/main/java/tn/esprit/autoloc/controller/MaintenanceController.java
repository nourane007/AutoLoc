package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Maintenance;
import tn.esprit.autoloc.service.IMaintenanceService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Maintenance")
@AllArgsConstructor
@RequestMapping("/maintenances")
public class MaintenanceController {
    private final IMaintenanceService maintenanceService;
    @GetMapping("/afficherToutesMaintenances")
    public List<Maintenance> getAllMaintenances(){
        return maintenanceService.afficherToutesMaintenances();
    }
    @GetMapping("/afficherMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id){
        return maintenanceService.afficherMaintenanceById(id);
    }
    @PostMapping("/ajouterMaintenance")
    public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.ajouterMaintenance(maintenance);
    }
    @PutMapping("/modifierMaintenance")
    public Maintenance modifierMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.modifierMaintenance(maintenance);
    }
    @DeleteMapping("/supprimerMaintenance/{id}")
    public void supprimerMaintenance(@PathVariable Long id){
        maintenanceService.supprimerMaintenance(id);
    }
}

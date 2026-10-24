package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployeController {
    private final IEmployeService employeService;
    @GetMapping("/afficherTousEmployes")
    public List<Employe> getAllEmployes(){
        return employeService.afficherTousEmployes();
    }
    @GetMapping("/afficherEmployeById/{id}")
    public Employe getEmployeById(@PathVariable Long id){
        return employeService.afficherEmployeById(id);
    }
    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe){
        return employeService.ajouterEmploye(employe);
    }
    @PutMapping("/modifierEmploye")
    public Employe modifierEmploye(@RequestBody Employe employe){
        return employeService.modifierEmploye(employe);
    }
    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id){
        employeService.supprimerEmploye(id);
    }
}

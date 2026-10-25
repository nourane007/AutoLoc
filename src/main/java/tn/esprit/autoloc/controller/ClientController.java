package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Client")
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final IClientService clientService;
    @GetMapping("/afficherTousClients")
    public List<Client> getAllClients(){
        return clientService.afficherTousClients();
    }
    @GetMapping("/afficherClientById/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.afficherClientById(id);
    }
    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client){
        return clientService.ajouterClient(client);
    }
    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client){
        return clientService.modifierClient(client);
    }
    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id){
        clientService.supprimerClient(id);
    }
}

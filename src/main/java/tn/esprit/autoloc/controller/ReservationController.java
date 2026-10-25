package tn.esprit.autoloc.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@Tag(name = "Gestion de Reservation")
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private final IReservationService reservationService;
    @GetMapping("/afficherToutesReservations")
    public List<Reservation> getAllReservations(){
        return reservationService.afficherToutesReservations();
    }
    @GetMapping("/afficherReservationById/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.afficherReservationById(id);
    }
    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation){
        return reservationService.ajouterReservation(reservation);
    }
    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation){
        return reservationService.modifierReservation(reservation);
    }
    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id){
        reservationService.supprimerReservation(id);
    }
}

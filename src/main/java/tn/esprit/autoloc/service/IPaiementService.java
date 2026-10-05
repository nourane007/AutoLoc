package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);

    Paiement modifierPaiement(Paiement paiement);

    List<Paiement> afficherTousPaiements();

    Paiement afficherPaiementById(Long id);

    void supprimerPaiement(Long id);
}

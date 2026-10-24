package tn.esprit.autoloc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;
    @JsonIgnore
    @OneToOne(mappedBy = "contrat", fetch = FetchType.LAZY)
    Reservation reservation;
    @JsonIgnore
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Paiement> paiements = new ArrayList<>();

}

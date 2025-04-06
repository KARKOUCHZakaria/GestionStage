package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.Gestion_De_Stage.models.enums.StatutDemande;

import java.sql.Date;


@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class DemandeDeStage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDemande;
    private String motivation;
    private String competence;

    @Enumerated(EnumType.STRING)
    private StatutDemande statut;

    @ManyToOne
    private Etudiant etudiant;

    @ManyToOne
    private OffreDeStage offreDeStage;
}


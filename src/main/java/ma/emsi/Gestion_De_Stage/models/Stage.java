package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Stage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    private String titre;
    private String description;
    private String mission;
    private String remuneration;

    @ManyToOne
    private Etudiant etudiant;

    @ManyToOne
    private Encadrent encadrent;

    @ManyToOne
    private Entreprise entreprise;

    @OneToOne(mappedBy = "stage", cascade = CascadeType.ALL)
    private AttestationDeStage attestationDeStage;
}
package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class OffreDeStage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Date datePublication;
    private Date dateExpiration;
    private String competenceDemandee;
    private String remuneration;
    private String duree;

    @ManyToOne
    private Entreprise entreprise;

    @OneToMany(mappedBy = "offreDeStage", fetch = FetchType.LAZY)
    private List<DemandeDeStage> demandesDeStage;
}
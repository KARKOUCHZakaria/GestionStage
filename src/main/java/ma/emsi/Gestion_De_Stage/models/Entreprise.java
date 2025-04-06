package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Entreprise {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String secteur;
    private String adresse;
    private String telephone;
    private String mail;
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise", fetch = FetchType.LAZY)
    private List<OffreDeStage> offresDeStage;

    @OneToMany(mappedBy = "entreprise", fetch = FetchType.LAZY)
    private List<Stage> stages;

    @OneToOne(mappedBy = "entreprise")
    private Recruteur recruteur;
}
package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@DiscriminatorValue("ETUDIANT")
public class Etudiant extends User {
    private String numeroEtudiant;
    private String filiere;
    private String niveau;

    @ManyToOne
    private Universite universite;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<DemandeDeStage> demandesDeStage;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<Stage> stages;
}
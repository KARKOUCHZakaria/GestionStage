package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.Gestion_De_Stage.models.enums.StatutEncadrant;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@DiscriminatorValue("ENCADRENT")
public class Encadrent extends User {
    private String specialite;
    private String departement;

    @Enumerated(EnumType.STRING)
    private StatutEncadrant statut;

    @OneToMany(mappedBy = "encadrent", fetch = FetchType.LAZY)
    private List<Stage> stagesEncadres;
}
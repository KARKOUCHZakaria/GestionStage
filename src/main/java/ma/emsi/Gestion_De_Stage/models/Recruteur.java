package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@DiscriminatorValue("RECRUTEUR")
public class Recruteur extends User {
    private String poste;
    private String departement;

    @ManyToOne
    private Entreprise entreprise;
}
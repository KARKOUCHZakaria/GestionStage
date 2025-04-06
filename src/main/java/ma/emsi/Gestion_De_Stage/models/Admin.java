package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@DiscriminatorValue("ADMIN")
public class Admin extends User {
    // Attributs spécifiques (peuvent être ajoutés si nécessaire)
}
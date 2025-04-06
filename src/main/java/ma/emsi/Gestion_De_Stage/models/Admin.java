package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data // ->hadi (mn dik import lombok ) kat3tina l getters o setters ol constructeur ...
@DiscriminatorValue("ADMIN")
public class Admin extends User {
   //manba3d
}
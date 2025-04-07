package ma.emsi.Gestion_De_Stage.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE_USER", discriminatorType = DiscriminatorType.STRING)
public abstract class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected Date dateCreation;
    protected String motDePasse;

}

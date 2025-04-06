package ma.emsi.Gestion_De_Stage.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String adresse;
    private String telephone;
    private String email;

    @OneToMany(mappedBy = "universite", fetch = FetchType.LAZY)
    private List<Etudiant> etudiants;
}
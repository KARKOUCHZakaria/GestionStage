package ma.emsi.Gestion_De_Stage.repositories;


import ma.emsi.Gestion_De_Stage.models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    Entreprise findByNom(String nom);
    List<Entreprise> findBySecteur(String secteur);
}
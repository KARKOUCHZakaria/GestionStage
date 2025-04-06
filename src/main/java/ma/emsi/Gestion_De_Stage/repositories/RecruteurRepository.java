package ma.emsi.Gestion_De_Stage.repositories;

import ma.emsi.Gestion_De_Stage.models.Recruteur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecruteurRepository extends JpaRepository<Recruteur, Long> {
    List<Recruteur> findByEntrepriseId(Long entrepriseId);
    List<Recruteur> findByPoste(String poste);
}
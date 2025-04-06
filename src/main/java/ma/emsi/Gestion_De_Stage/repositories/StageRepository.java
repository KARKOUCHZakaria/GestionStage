package ma.emsi.Gestion_De_Stage.repositories;

import ma.emsi.Gestion_De_Stage.models.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StageRepository extends JpaRepository<Stage, Long> {
    List<Stage> findByEtudiantId(Long etudiantId);
    List<Stage> findByEncadrentId(Long encadrentId);
    List<Stage> findByEntrepriseId(Long entrepriseId);
}

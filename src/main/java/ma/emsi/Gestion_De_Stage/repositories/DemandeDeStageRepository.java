package ma.emsi.Gestion_De_Stage.repositories;


import ma.emsi.Gestion_De_Stage.models.DemandeDeStage;
import ma.emsi.Gestion_De_Stage.models.enums.StatutDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DemandeDeStageRepository extends JpaRepository<DemandeDeStage, Long> {
    List<DemandeDeStage> findByStatut(StatutDemande statut);
    List<DemandeDeStage> findByEtudiantId(Long etudiantId);
    List<DemandeDeStage> findByOffreDeStageId(Long offreId);
}
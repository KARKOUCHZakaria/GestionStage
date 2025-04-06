package ma.emsi.Gestion_De_Stage.repositories;

import ma.emsi.Gestion_De_Stage.models.OffreDeStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;

public interface OffreDeStageRepository extends JpaRepository<OffreDeStage, Long> {
    @Query("SELECT o FROM OffreDeStage o WHERE o.dateExpiration >= CURRENT_DATE")
    List<OffreDeStage> findActiveOffers();

    List<OffreDeStage> findByCompetenceDemandeeContainingIgnoreCase(String competence);

    List<OffreDeStage> findByDateExpirationAfter(Date date);
}
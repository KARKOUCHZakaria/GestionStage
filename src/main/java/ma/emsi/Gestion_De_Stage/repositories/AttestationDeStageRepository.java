package ma.emsi.Gestion_De_Stage.repositories;


import ma.emsi.Gestion_De_Stage.models.AttestationDeStage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttestationDeStageRepository extends JpaRepository<AttestationDeStage, Long> {
    AttestationDeStage findByStageId(Long stageId);
}
package ma.emsi.Gestion_De_Stage.repositories;


import ma.emsi.Gestion_De_Stage.models.Encadrent;
import ma.emsi.Gestion_De_Stage.models.enums.StatutEncadrant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EncadrentRepository extends JpaRepository<Encadrent, Long> {
    List<Encadrent> findByStatut(StatutEncadrant statut);
    List<Encadrent> findByDepartement(String departement);
}
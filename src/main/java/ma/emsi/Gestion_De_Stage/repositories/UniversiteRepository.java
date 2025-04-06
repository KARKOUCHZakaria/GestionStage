package ma.emsi.Gestion_De_Stage.repositories;

import ma.emsi.Gestion_De_Stage.models.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    Universite findByNom(String nom);
}

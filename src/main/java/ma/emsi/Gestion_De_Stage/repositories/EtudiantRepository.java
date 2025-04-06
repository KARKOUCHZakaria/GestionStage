package ma.emsi.Gestion_De_Stage.repositories;

import ma.emsi.Gestion_De_Stage.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Etudiant findByNumeroEtudiant(String numeroEtudiant);

    @Query("SELECT e FROM Etudiant e WHERE e.filiere = ?1")
    List<Etudiant> findByFiliere(String filiere); // had String filiere kaysawi ?1 f l query

    List<Etudiant> findByNiveau(String niveau);
}
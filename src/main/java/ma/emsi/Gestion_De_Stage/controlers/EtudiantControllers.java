package ma.emsi.Gestion_De_Stage.controlers;

import ma.emsi.Gestion_De_Stage.models.Etudiant;
import ma.emsi.Gestion_De_Stage.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtudiantControllers {
    @Autowired
    private EtudiantRepository etudiantRepo;

    @PostMapping(value = "/insertEtudiant")
    public String insertEtudiant(@RequestBody Etudiant etu){
        etudiantRepo.save(etu);
        return "saved .....";
    }

}

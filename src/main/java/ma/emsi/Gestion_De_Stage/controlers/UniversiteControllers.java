package ma.emsi.Gestion_De_Stage.controlers;

import ma.emsi.Gestion_De_Stage.models.Universite;
import ma.emsi.Gestion_De_Stage.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class UniversiteControllers {
    @Autowired
    private UniversiteRepository universiteRepository;
    @PostMapping(value = "/universite")
    public String insertUniversite(@RequestBody Universite uni){
        universiteRepository.save(uni);
        return "saved .....";
    }
}

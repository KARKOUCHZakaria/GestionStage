package ma.emsi.Gestion_De_Stage.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControlers {

    @GetMapping(value = "/")
    public String getpage(){
        return "Hello zakaria";
    }
}

package ma.emsi.Gestion_De_Stage.controlers;

import ma.emsi.Gestion_De_Stage.models.User;
import ma.emsi.Gestion_De_Stage.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllers {
    @Autowired
    private UserRepository userRepo;

    @GetMapping(value = "/users")
    public List<User> getUsers(){
       return userRepo.findAll();
    }
    @PostMapping(value = "/insert")
    public String insertUser(@RequestBody User user){
        userRepo.save(user);
        return "saved .....";
    }


}

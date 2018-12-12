package de.kieferni.springserversa.controller;

import de.kieferni.springserversa.models.docUser;
import de.kieferni.springserversa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/user")
    public List<docUser> getAlldocUser() { return userService.getAlldocUser();}

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/user/{id}")
    public docUser getAlldocUser(@PathVariable Long id){
        return userService.getSingledocUser(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/user/register", method = RequestMethod.POST, consumes = "application/json")
    public void addUser(@RequestBody docUser newUser) {
        userService.saveUser(newUser);
    }
}

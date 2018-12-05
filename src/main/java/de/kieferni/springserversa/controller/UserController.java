package de.kieferni.springserversa.controller;

import de.kieferni.springserversa.models.docUser;
import de.kieferni.springserversa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<docUser> getAlldocUser() { return userService.getAlldocUser();}

    @RequestMapping("/user/{id}")
    public docUser getAlldocUser(@PathVariable Long id){
        return userService.getSingledocUser(id);
    }
}

package de.kieferni.springserversa.services;

import de.kieferni.springserversa.models.docUser;
import de.kieferni.springserversa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<docUser> getAlldocUser(){
        List<docUser> docUsers = new ArrayList<>();
        userRepository.findAll().forEach(docUsers::add);
        return docUsers;
    }

    public docUser getSingledocUser(Long id) {return userRepository.f.findById(id).get();}

    public void saveUser(docUser docUser) {
        System.out.println(docUser);
        userRepository.save(docUser);
    }
}

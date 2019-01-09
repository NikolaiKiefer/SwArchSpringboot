package de.kieferni.springserversa.repository;

import de.kieferni.springserversa.models.docUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<docUser, Long> {

    Optional<docUser> findByuName(String uName);
    Boolean existsByuName(String uName);
    Boolean existsByEmail(String email);
}



package de.kieferni.springserversa.repository;

import de.kieferni.springserversa.models.docUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<docUser, Long> {
}

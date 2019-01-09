package de.kieferni.springserversa.repository;

import de.kieferni.springserversa.models.Role;
import de.kieferni.springserversa.models.RoleName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}

package de.kieferni.springserversa.repository;

import de.kieferni.springserversa.models.docVersion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepository extends CrudRepository<docVersion,Long> {
}

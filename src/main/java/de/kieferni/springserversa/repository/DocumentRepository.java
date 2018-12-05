package de.kieferni.springserversa.repository;

import de.kieferni.springserversa.models.Dokument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends CrudRepository<Dokument,Long>{
}

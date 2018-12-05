package de.kieferni.springserversa.services;

import de.kieferni.springserversa.models.docVersion;
import de.kieferni.springserversa.repository.VersionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class VersionService {

    @Autowired
    private VersionRepository versionRepository;

    public List<docVersion> getAlldocVersions(){
        List<docVersion> docVersions = new ArrayList<>();
        versionRepository.findAll().forEach(docVersions::add);
        return docVersions;
    }


}

package de.kieferni.springserversa.controller;

import de.kieferni.springserversa.models.docVersion;
import de.kieferni.springserversa.repository.VersionRepository;
import de.kieferni.springserversa.services.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VersionController {

    @Autowired
    private VersionService versionService;

    @RequestMapping("/versions")
    public List<docVersion>getAllVersions() { return versionService.getAlldocVersions();}
}

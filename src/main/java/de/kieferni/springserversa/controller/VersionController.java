package de.kieferni.springserversa.controller;

import de.kieferni.springserversa.models.Dokument;
import de.kieferni.springserversa.models.FileFormat;
import de.kieferni.springserversa.models.docVersion;
import de.kieferni.springserversa.models.versionId;
import de.kieferni.springserversa.repository.VersionRepository;
import de.kieferni.springserversa.services.DocumentService;
import de.kieferni.springserversa.services.VersionService;
import oracle.sql.BLOB;
import org.hibernate.Hibernate;
import org.hibernate.LobHelper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.ConnectionProperties;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.spi.ServiceRegistry;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

@RestController
public class VersionController {

    @Autowired
    private VersionService versionService;

    @Autowired
    private DocumentService documentService;

    @RequestMapping("/versions")
    public List<docVersion>getAllVersions() { return versionService.getAlldocVersions();}

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/version/save", method = RequestMethod.POST, consumes = "application/json")
    public void addVersion(@RequestParam("file") MultipartFile file, @RequestParam("dokumentdid") long dokumentdid, @RequestParam("fileformatidfid") long fileformatidfid, @RequestParam("vtimestamp") Timestamp vtimestamp) {
        System.out.println(file);
    }
}

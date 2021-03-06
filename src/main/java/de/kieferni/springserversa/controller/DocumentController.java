package de.kieferni.springserversa.controller;

import de.kieferni.springserversa.models.Dokument;
import de.kieferni.springserversa.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @RequestMapping("/docs")
    public List<Dokument> getAllDoc() { return documentService.getAllDocs();}

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @RequestMapping("/docs/{id}")
    public Dokument getSingleDoc(@PathVariable Long id) { return documentService.getSingleDoc(id);}
}

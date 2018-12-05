package de.kieferni.springserversa.services;

import de.kieferni.springserversa.models.Dokument;
import de.kieferni.springserversa.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public List<Dokument>getAllDocs(){
        List<Dokument> docs = new ArrayList<>();
        documentRepository.findAll().forEach(docs::add);
        return docs;
    }

    public Dokument getSingleDoc(Long id){ return documentRepository.findById(id).get();}
}

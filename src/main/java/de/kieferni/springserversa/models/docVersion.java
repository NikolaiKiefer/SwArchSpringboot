package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.BLOB;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@AllArgsConstructor
//@NoArgsConstructor
@Data
public class docVersion {

    @EmbeddedId
    private versionId vId;

    @Lob
    private byte[] file;

    @OneToOne(fetch = FetchType.EAGER)
    private FileFormat fileFormatId;


}

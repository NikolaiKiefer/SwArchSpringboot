package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class docVersion {

    @EmbeddedId
    private versionId vId;

    private String file;






}

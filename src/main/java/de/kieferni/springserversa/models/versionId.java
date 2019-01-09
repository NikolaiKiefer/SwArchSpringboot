package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@Embeddable
public class versionId implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    private Dokument dokument;

    private Timestamp vTimestamp;
}

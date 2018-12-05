package de.kieferni.springserversa.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
public class versionId implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    private Dokument dokument;

    private Timestamp vTimestamp;
}

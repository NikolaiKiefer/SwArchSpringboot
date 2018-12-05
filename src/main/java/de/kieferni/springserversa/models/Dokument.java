package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Dokument {

    @Id
    @GeneratedValue
    private long dId;

    private String name;

    /*@ManyToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.REMOVE,
    mappedBy = "docs")
    private Collection<docUser> user;*/

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "vId.dokument")
    private Collection<docVersion> versions;

}

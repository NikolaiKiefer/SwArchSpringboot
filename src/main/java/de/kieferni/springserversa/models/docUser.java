package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class docUser {


    @Id
    @GeneratedValue
    private long uId;

    private String uName;
    private String email;
    private String uPassword;

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JoinTable(name = "Permissions", joinColumns = {@JoinColumn(name="uId")},
    inverseJoinColumns = { @JoinColumn(name = "dId")})
    private Collection<Dokument> docs;
}

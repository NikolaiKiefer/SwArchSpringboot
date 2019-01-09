package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class docUser {


    @Id
    @GeneratedValue
    private long uId;

    private String uName;
    private String email;
    private String uPassword;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JoinTable(name = "Permissions", joinColumns = {@JoinColumn(name="uId")},
    inverseJoinColumns = { @JoinColumn(name = "dId")})
    private Collection<Dokument> docs;


    public Long getId() {
        return uId;
    }

    public void setId(Long id) {
        this.uId = id;
    }

    public String getUsername() {
        return uName;
    }

    public void setUsername(String username) {
        this.uName = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return uPassword;
    }

    public void setPassword(String password) {
        this.uPassword = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Collection<Dokument> getDocs() { return docs; }

    public void setDocs(Collection<Dokument> docs) { this.docs = docs; }
}

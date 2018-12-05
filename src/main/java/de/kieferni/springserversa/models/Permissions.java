package de.kieferni.springserversa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Permissions {

    @EmbeddedId
    private PermissionId permissionId;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean permissions;

}

package de.kieferni.springserversa.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PermissionId implements Serializable {
    
    private String uId;
    private String dId;
}

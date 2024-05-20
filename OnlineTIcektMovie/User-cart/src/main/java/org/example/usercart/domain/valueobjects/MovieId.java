package org.example.usercart.domain.valueobjects;


import jakarta.persistence.Embeddable;
import org.example.sharedkernel.domain.base.DomainObjectId;

@Embeddable
public class MovieId extends DomainObjectId {

    public MovieId(String uuid) {
        super(uuid);
    }

    public MovieId() {
        super(MovieId.randomId(MovieId.class).getId());
    }
}

package org.example.movies.domain.models;

import lombok.NonNull;
import org.example.sharedkernel.domain.base.DomainObjectId;

public class MovieId extends DomainObjectId {

    private MovieId() {
        super(MovieId.randomId(MovieId.class).getId());
    }

    public MovieId(@NonNull String uuid) {
        super(uuid);
    }

    public static MovieId of(String uuid) {
        MovieId m = new MovieId(uuid);
        return m;
    }

}


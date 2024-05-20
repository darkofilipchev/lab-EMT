package org.example.usercart.domain.models;

import lombok.NonNull;
import org.example.sharedkernel.domain.base.DomainObjectId;

public class TicketId extends DomainObjectId {

    private TicketId() {
        super(TicketId.randomId(TicketId.class).getId());
    }

    public TicketId(@NonNull String uuid) {
        super(uuid);
    }

}

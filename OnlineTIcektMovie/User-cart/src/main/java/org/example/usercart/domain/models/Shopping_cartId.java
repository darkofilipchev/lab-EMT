package org.example.usercart.domain.models;

import lombok.NonNull;
import org.example.sharedkernel.domain.base.DomainObjectId;

public class Shopping_cartId extends DomainObjectId {

    private Shopping_cartId() {
        super(TicketId.randomId(Shopping_cartId.class).getId());
    }

    public Shopping_cartId(@NonNull String uuid) {
        super(uuid);
    }
}

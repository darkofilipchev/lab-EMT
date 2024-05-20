package org.example.usercart.domain.models;

import jakarta.persistence.*;
import lombok.NonNull;
import org.example.sharedkernel.domain.base.AbstractEntity;
import org.example.usercart.domain.valueobjects.Movie;
import org.example.movies.domain.valueobjects.Currency;
import org.example.movies.domain.valueobjects.Money;

import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tickets")
public class Ticket extends AbstractEntity<TicketId> {


    private Instant ordered_On;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Enumerated(EnumType.STRING)


    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private Set<Shopping_cart> shoppingCartList;

    public Ticket(){
        super(TicketId.randomId(TicketId.class));
    }

    public Ticket(Instant now, org.example.movies.domain.valueobjects.Currency currency) {
        super(TicketId.randomId(TicketId.class));
        this.currency = currency;
    }

    public Money total(){
        return shoppingCartList.stream().map(Shopping_cart::subTotal).reduce(new Money(currency,0),Money::add);
    }

}

package org.example.usercart.service;

import org.example.usercart.domain.models.Ticket;
import org.example.usercart.domain.models.TicketId;
import org.example.usercart.domain.models.Shopping_cartId;
import org.example.usercart.service.forms.TicketItemForm;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> findAll();

    Optional<Ticket> findById(TicketId id);

    void addItem(TicketId ticketId, TicketItemForm ticketItemForm);

    void deleteItem(TicketId id, Shopping_cartId shoppingCartId);

}

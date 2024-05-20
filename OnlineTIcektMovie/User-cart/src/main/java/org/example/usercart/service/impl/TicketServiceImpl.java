package org.example.usercart.service.impl;

import lombok.AllArgsConstructor;
import org.example.usercart.domain.models.Ticket;
import org.example.usercart.domain.models.TicketId;
import org.example.usercart.domain.models.Shopping_cartId;
import org.example.usercart.repository.TicketReposiroty;
import org.example.usercart.service.TicketService;
import org.example.usercart.service.forms.TicketItemForm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketReposiroty ticketReposiroty;


    @Override
    public List<Ticket> findAll() {
        return ticketReposiroty.findAll();
    }

    @Override
    public Optional<Ticket> findById(TicketId id) {
        return ticketReposiroty.findById(id);
    }

    @Override
    public void addItem(TicketId ticketId, TicketItemForm ticketItemForm) {
        Ticket ticket = ticketReposiroty.findById(ticketId).orElseThrow(RuntimeException::new);
        ticketReposiroty.saveAndFlush(ticket);
    }

    @Override
    public void deleteItem(TicketId id, Shopping_cartId shoppingCartId) {
        Ticket ticket = ticketReposiroty.findById(id).orElseThrow(RuntimeException::new);
        ticketReposiroty.saveAndFlush(ticket);
    }
}

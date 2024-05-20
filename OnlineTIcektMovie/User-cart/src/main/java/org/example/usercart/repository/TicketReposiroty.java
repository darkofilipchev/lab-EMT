package org.example.usercart.repository;

import org.example.usercart.domain.models.Ticket;
import org.example.usercart.domain.models.TicketId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketReposiroty extends JpaRepository<Ticket, TicketId> {
}

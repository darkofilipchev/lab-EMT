package org.example.usercart.service.forms;


import lombok.Data;
import org.example.usercart.domain.valueobjects.Movie;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class TicketItemForm {

    @NotNull
    private Movie movie;

    @Min(1)
    private int quantity = 1;
}

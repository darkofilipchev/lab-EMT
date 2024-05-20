package org.example.usercart.service.forms;


import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Data
public class TicketForm {

    @NotNull
    private Currency currency;

    @Valid
    @NotEmpty
    private List<TicketItemForm> items = new ArrayList<>();



}

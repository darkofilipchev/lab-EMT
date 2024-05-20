package org.example.movies.service.form;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import org.example.movies.domain.valueobjects.Money;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class MovieForm {

    @NotNull
    private String MovieName;

    @Min(0)
    private Money price;

    @Enumerated(EnumType.STRING)

    @Valid
    @NotEmpty
    private String Cast;

    @DateTimeFormat
    private Date yearOfProduction;
}

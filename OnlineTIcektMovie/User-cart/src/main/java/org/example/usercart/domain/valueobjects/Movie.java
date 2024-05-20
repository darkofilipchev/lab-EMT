package org.example.usercart.domain.valueobjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.example.sharedkernel.domain.base.ValueObjects;
import org.example.movies.domain.valueobjects.Currency;
import org.example.movies.domain.valueobjects.Money;

@Getter
public class Movie implements ValueObjects {

    private final MovieId id;
    private final String name;
    private final Money price;

    private Movie() {
        this.id= MovieId.randomId(MovieId.class);
        this.name= "";
        this.price = Money.valueOf(Currency.MKD,0);
    }

    @JsonCreator
    public Movie(@JsonProperty("id") MovieId id,
                 @JsonProperty("productName") String name,
                 @JsonProperty("price") Money price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

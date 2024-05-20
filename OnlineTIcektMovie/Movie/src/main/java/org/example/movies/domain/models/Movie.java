package org.example.movies.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import org.example.sharedkernel.domain.base.AbstractEntity;
import org.example.movies.domain.valueobjects.Money;

import java.util.Date;

@Entity
@Table(name = "movies")
@Getter
public class Movie extends AbstractEntity<MovieId> {

    private String MovieName;

    private String Cast;

    private Date yearOfProduction;

    @Enumerated(EnumType.STRING)

    private Money price;

    public Movie() {
        super(MovieId.randomId(MovieId.class));
    }

    public static Movie build(String serialNumber, String model, Date yearOfProduction, Money money, int sales){
        Movie v = new Movie();
        v.MovieName = serialNumber;
        v.Cast = model;
        v.yearOfProduction = yearOfProduction;
        v.price = money;
        return v;
    }

    public static Movie build(String serialnumber, String model, Date yearOfProduction) {
    return null;
    }
}

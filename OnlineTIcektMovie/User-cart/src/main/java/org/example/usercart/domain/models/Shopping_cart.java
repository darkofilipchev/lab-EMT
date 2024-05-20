package org.example.usercart.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import org.example.sharedkernel.domain.base.AbstractEntity;
import org.example.sharedkernel.domain.base.DomainObjectId;
import org.example.usercart.domain.valueobjects.MovieId;
import org.example.movies.domain.valueobjects.Money;

@Entity
@Table(name = "shopping_cart")
@Getter
public class Shopping_cart extends AbstractEntity<Shopping_cartId> {

    private Money sum;

    @Column(name = "qty", nullable = false)
    private int quantity;

    @AttributeOverride(name = "id", column = @Column(name = "movie_id", nullable = false))
    private MovieId movieId;


    public Shopping_cart(@NonNull MovieId movieId, @NonNull Money sum, int qty){
        super(DomainObjectId.randomId(Shopping_cartId.class));
        this.movieId = movieId;
        this.sum=sum;
        this.quantity=qty;
    }

    public Shopping_cart() {

    }


    public Money subTotal(){
        return sum.multiply(quantity);
    }


}

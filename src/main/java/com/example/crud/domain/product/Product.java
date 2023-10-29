package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private  Integer price_in_cents;

    private Boolean active;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;
    }

    //Para não usar os gets e sets utiliza-se as anotações @Getter
    //public Number getPriceInCents(){
      //  return price_in_cents;
    //}
}

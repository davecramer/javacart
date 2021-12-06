package rocks.postgres.javacart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product ")
public class Product {
    @Id
    Long id;
    String name;
    Double price;
    Integer stock;

    @ManyToOne
    Order order;
}

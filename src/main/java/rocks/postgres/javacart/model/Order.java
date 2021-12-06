package rocks.postgres.javacart.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    Long id;
    @JoinColumn(name="order_id")
    @OneToMany
    List<Product> products;
    @OneToOne
    Customer customer;
}

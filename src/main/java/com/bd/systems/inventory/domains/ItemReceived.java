package com.bd.systems.inventory.domains;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_received")
public class ItemReceived {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @NonNull
    private Product product;

    @NonNull
    private int quantity;

    @NonNull
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

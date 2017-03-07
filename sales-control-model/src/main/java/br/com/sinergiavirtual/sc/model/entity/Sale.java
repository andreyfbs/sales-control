package br.com.sinergiavirtual.sc.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal amount;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    private Seller seller;

    public Sale() {
        super();
    }

    public Sale(BigDecimal amount, Product product, Seller seller) {
        this.amount = amount;
        this.product = product;
        this.seller = seller;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product;
    }

    public Seller getSeller() {
        return seller;
    }
}

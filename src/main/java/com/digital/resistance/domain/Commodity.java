package com.digital.resistance.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name= "commodity")
public class Commodity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "sum")
    private int sum;

    @Column(name="quantity")
    private double quantity;

    @Column(name="price")
    private int price;

    @Column(name="name")
    private String name;

    @Column(name="busy")
    private int busy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBusy() {
        return busy;
    }

    public void setBusy(int busy) {
        this.busy = busy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return id == commodity.id &&
                sum == commodity.sum &&
                Double.compare(commodity.quantity, quantity) == 0 &&
                price == commodity.price &&
                busy == commodity.busy &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sum, quantity, price, name, busy);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", sum=" + sum +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", busy=" + busy +
                '}';
    }
}

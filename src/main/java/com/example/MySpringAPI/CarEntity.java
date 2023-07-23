package com.example.MySpringAPI;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "car", schema = "public", catalog = "postgres")
public class CarEntity {
    public CarEntity() {}
    public CarEntity(String brand, String model, String color, int price, int kilometerCount) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.kilometerCount = kilometerCount;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "brand")
    private String brand;
    @Basic
    @Column(name = "model")
    private String model;
    @Basic
    @Column(name = "color")
    private String color;
    @Basic
    @Column(name = "price")
    private int price;
    @Basic
    @Column(name = "kilometer_count")
    private int kilometerCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKilometerCount() {
        return kilometerCount;
    }

    public void setKilometerCount(int kilometerCount) {
        this.kilometerCount = kilometerCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id && kilometerCount == carEntity.kilometerCount && Objects.equals(brand, carEntity.brand) && Objects.equals(model, carEntity.model) && Objects.equals(color, carEntity.color) && Objects.equals(price, carEntity.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, price, kilometerCount);
    }
}

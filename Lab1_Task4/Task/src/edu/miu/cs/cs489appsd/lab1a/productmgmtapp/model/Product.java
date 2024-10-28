package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;
import java.time.LocalDate;

public class Product {
    private Long product_Id;
    private String name;
    private LocalDate date_supplied;
    private int quantityInStock;
    private double unitPrice;

    public Product(Long product_Id, String name, LocalDate date_supplied, int quantityInStock, double unitPrice) {
        this.product_Id = product_Id;
        this.name = name;
        this.date_supplied = date_supplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product(String name, LocalDate date_supplied, int quantityInStock, double unitPrice) {
        this.name = name;
        this.date_supplied = date_supplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product() {

    }

    public Long getProduct_Id() {
        return product_Id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate_supplied() {
        return date_supplied;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProduct_Id(Long product_Id) {
        this.product_Id = product_Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate_supplied(LocalDate date_supplied) {
        this.date_supplied = date_supplied;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}

package com.josh.port.model;

public class ProductModel {
    private long id;
    private String name;
    private String description;
    private float price;
    private int qty;

    // Contructor
    //default
    public ProductModel() {
    }

    //paramiterized 
    public ProductModel(long iD, String name, String description, float price, int qty) {
        this.id = iD;
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
    }

    

    @Override
    public String toString() {
        return "ProductModel [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
                + ", qty=" + qty + "]";
    }

    // Getters / setters
    public long getId() {
        return id;
    }
    
    public void setId(long iD) {
        id = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    
}

package comp.specs.Computer_Specs_System;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PcShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String shopName;
    private double ratings;
    private String location;

    public PcShop() {}

    public PcShop(String shopName, double ratings, String location) {
        this.shopName = shopName;
        this.ratings = ratings;
        this.location = location;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }

    public double getRatings() { return ratings; }
    public void setRatings(double ratings) { this.ratings = ratings; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}

package comp.specs.pcShops;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PcShop {

    @Id
    private int Id;

    private String shopName;
    private double ratings;
    private String location;

    public PcShop() {}

    
    public PcShop(int Id, String shopName, double ratings, String location) {
        this.Id = Id;
        this.shopName = shopName;
        this.ratings = ratings;
        this.location = location;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
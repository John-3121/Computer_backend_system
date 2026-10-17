package comp.specs.Computer_Specs_System;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    // Each computer belongs to one shop (creates a shop_id column)
    @ManyToOne
    @JoinColumn(name = "shop_id")
    @JsonIgnore
    private PcShop shop;

    public Computer() {}

    public Computer(String processor, int ram, int storage, String graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public int getRam() { return ram; }
    public void setRam(int ram) { this.ram = ram; }

    public int getStorage() { return storage; }
    public void setStorage(int storage) { this.storage = storage; }

    public String getGraphicsCard() { return graphicsCard; }
    public void setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; }

    public PcShop getShop() { return shop; }
    public void setShop(PcShop shop) { this.shop = shop; }
}

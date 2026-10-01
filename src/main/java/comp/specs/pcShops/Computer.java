package comp.specs.pcShops;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Computer {
    @Id
    private int Id;
    private String processor; 
    private int ram;
    private int storage;
    private String graphicsCard;
    
    public Computer() {}
    
    public Computer(int Id, String processor, int ram, int storage, String graphicsCard) {
        this.Id = Id;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    // Getters and Setters

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

  @Override
public String toString() {
    return "Computer {" +
            "Id=" + Id +
            ", processor='" + processor + '\'' +
            ", ram=" + ram +
            ", storage=" + storage +
            ", graphicsCard='" + graphicsCard + '\'' +
            '}';
}
    
}
package comp.specs.Computer_Specs_System;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CompService {

  private  List<Computer> computers = new ArrayList<>(Arrays.asList(
          new Computer(1,"Intel i5",16,512,"NVIDIA GTX 1650"),
          new Computer(2,"Intel i7",32,1024,"NVIDIA RTX 3060"),
          new Computer(3,"AMD Ryzen 5",16,512,"AMD Radeon RX 580")));
    
    public List<Computer> getAllComputer(){
        return computers;
    }
    
    public Computer getComputer(int id){
        //u can also use this one below:
        // Computer result = computers.stream().filter(computer -> computer.getId() == id).findFirst().orElse(null);
        for(Computer computer:computers){
            if(computer.getId() == id){
                return computer;
            }
        }
        return null;
    }
    
    
    public void addComputer(Computer computer){
        computers.add(computer);
    }
    
    
    public void updateComputer(int id, Computer updatedComputer){
        for(Computer computer:computers){
            if(id == computer.getId()){
                computer.setProcessor(updatedComputer.getProcessor());
                computer.setRam(updatedComputer.getRam());
                computer.setStorage(updatedComputer.getStorage());
                computer.setGraphicsCard(updatedComputer.getGraphicsCard());
            }
        }
    }
    
    public void deleteComputer(int id){
            computers.removeIf(computer -> computer.getId() == id);
    }
}
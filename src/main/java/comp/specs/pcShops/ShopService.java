package comp.specs.pcShops;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.Entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;
    
   /* private  List<Computer> computers = new ArrayList<>(Arrays.asList(
          new Computer(1,"Intel i5",16,512,"NVIDIA GTX 1650"),
          new Computer(2,"Intel i7",32,1024,"NVIDIA RTX 3060"),
          new Computer(3,"AMD Ryzen 5",16,512,"AMD Radeon RX 580")));
   */
    public List<PcShop> getAllShop(){
        
        List<PcShop> shops = new ArrayList<>(); 
        shopRepository.findAll().forEach(shops::add);
        return shops;
    }
    
    public PcShop getShop(int id){
        //u can also use this one below;
        // Computer result = computers.stream().filter(computer -> computer.getId() == id).findFirst().orElse(null);
       /* for(Computer computer:computers){
            if(computer.getId() == id){
                return computer;
            }
        }
        return null;
        */
        return shopRepository.findById(id).orElse(null);
        
    }
    
    
    public void addShop(PcShop shops){
        shopRepository.save(shops);
    }
    
    
    public void updateShop(int id, PcShop updatedShop){
      /*  for(Computer computer:computers){
            if(id == computer.getId()){
                computer.setProcessor(updatedComputer.getProcessor());
                computer.setRam(updatedComputer.getRam());
                computer.setStorage(updatedComputer.getStorage());
                computer.setGraphicsCard(updatedComputer.getGraphicsCard());
            }
        }*/
        shopRepository.save(updatedShop);
        
    }
    
    public void deleteShop(int id){
          //  computers.removeIf(computer -> computer.getId() == id);
        shopRepository.deleteById(id);
    }
}
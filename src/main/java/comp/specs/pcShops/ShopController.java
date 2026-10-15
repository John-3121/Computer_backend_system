package comp.specs.pcShops;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/pcshops")
public class ShopController {
    
    @Autowired
    private ShopService shopService;
    
    @GetMapping
    public List<PcShop> getAllShop(){
        return shopService.getAllShop();
    }
    
    @GetMapping("/{id}")
    public PcShop getShop(@PathVariable int id){
        return shopService.getShop(id);
    }
    
    @PostMapping
    public void createShop(@RequestBody PcShop shop){
        shopService.addShop(shop);
    }
    
    @PutMapping("/{id}")
    public void updateShop(@PathVariable int id,@RequestBody PcShop updatedShop){
        shopService.updateShop(id,updatedShop);
        
    }
    
    @DeleteMapping("/{id}")
    public void deleteShop(@PathVariable int id){
        shopService.deleteShop(id);
    }
}

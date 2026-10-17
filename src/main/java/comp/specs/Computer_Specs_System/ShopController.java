package comp.specs.Computer_Specs_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pcshops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public List<PcShop> getAllShop() {
        return shopService.getAllShop();
    }

    @GetMapping("/{id}")
    public PcShop getShop(@PathVariable int id) {
        return shopService.getShop(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PcShop createShop(@RequestBody PcShop shop) {
        return shopService.addShop(shop);
    }

    @PutMapping("/{id}")
    public PcShop updateShop(@PathVariable int id, @RequestBody PcShop updatedShop) {
        return shopService.updateShop(id, updatedShop);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteShop(@PathVariable int id) {
        shopService.deleteShop(id);
    }
}

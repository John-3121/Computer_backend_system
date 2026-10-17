package comp.specs.Computer_Specs_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    private PcShop findShop(int id) {
        return shopRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shop " + id + " not found"));
    }

    public List<PcShop> getAllShop() {
        return shopRepository.findAll();
    }

    public PcShop getShop(int id) {
        return findShop(id);
    }

    public PcShop addShop(PcShop shop) {
        shop.setId(null); // let the database generate the id
        return shopRepository.save(shop);
    }

    public PcShop updateShop(int id, PcShop updated) {
        PcShop existing = findShop(id);
        existing.setShopName(updated.getShopName());
        existing.setRatings(updated.getRatings());
        existing.setLocation(updated.getLocation());
        return shopRepository.save(existing);
    }

    public void deleteShop(int id) {
        shopRepository.delete(findShop(id));
    }
}

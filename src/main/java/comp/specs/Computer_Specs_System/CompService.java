package comp.specs.Computer_Specs_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CompService {

    @Autowired
    private CompRepository compRepository;

    @Autowired
    private ShopRepository shopRepository;

    private PcShop findShop(int shopId) {
        return shopRepository.findById(shopId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shop " + shopId + " not found"));
    }

    private Computer findComputer(int shopId, int id) {
        return compRepository.findByIdAndShopId(id, shopId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Computer " + id + " not found in shop " + shopId));
    }

    public List<Computer> getAllComputer(int shopId) {
        findShop(shopId);
        return compRepository.findByShopId(shopId);
    }

    public Computer getComputer(int shopId, int id) {
        return findComputer(shopId, id);
    }

    public Computer addComputer(int shopId, Computer computer) {
        computer.setId(null); // let the database generate the id
        computer.setShop(findShop(shopId));
        return compRepository.save(computer);
    }

    public Computer updateComputer(int shopId, int id, Computer updated) {
        Computer existing = findComputer(shopId, id);
        existing.setProcessor(updated.getProcessor());
        existing.setRam(updated.getRam());
        existing.setStorage(updated.getStorage());
        existing.setGraphicsCard(updated.getGraphicsCard());
        return compRepository.save(existing);
    }

    public void deleteComputer(int shopId, int id) {
        compRepository.delete(findComputer(shopId, id));
    }
}

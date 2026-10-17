package comp.specs.Computer_Specs_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pcshops/{shopId}/computers")
public class Compcontroller {

    @Autowired
    private CompService compService;

    @GetMapping
    public List<Computer> getAllComputer(@PathVariable int shopId) {
        return compService.getAllComputer(shopId);
    }

    @GetMapping("/{id}")
    public Computer getComputer(@PathVariable int shopId, @PathVariable int id) {
        return compService.getComputer(shopId, id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Computer createComputer(@PathVariable int shopId, @RequestBody Computer computer) {
        return compService.addComputer(shopId, computer);
    }

    @PutMapping("/{id}")
    public Computer updateComputer(@PathVariable int shopId, @PathVariable int id,
                                   @RequestBody Computer updatedComputer) {
        return compService.updateComputer(shopId, id, updatedComputer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComputer(@PathVariable int shopId, @PathVariable int id) {
        compService.deleteComputer(shopId, id);
    }
}

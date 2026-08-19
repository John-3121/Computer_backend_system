package comp.specs.Computer_Specs_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/Computers")
public class Compcontroller {
    
    @Autowired
    private CompService compService;
    
    @GetMapping
    public List<Computer> rtnAllComputer(){
        return compService.getAllComputer();
    }
    
    @GetMapping("/{id}")
    public Computer getComputer(@PathVariable int id){
        return compService.getComputer(id);
    }
    
    @PostMapping
    public void createComputer(@RequestBody Computer computer){
        compService.addComputer(computer);
    }
    
    @PutMapping("/{id}")
    public void updateComputer(@PathVariable int id,@RequestBody Computer updatedComputer){
        compService.updateComputer(id,updatedComputer);
        
    }
    
    @DeleteMapping("/{id}")
    public void deleteComputer(@PathVariable int id){
        compService.deleteComputer(id);
    }
}

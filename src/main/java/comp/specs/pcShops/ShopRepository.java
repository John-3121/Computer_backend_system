package comp.specs.pcShops;


import comp.specs.Computer_Specs_System.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Computer, Integer> {
}
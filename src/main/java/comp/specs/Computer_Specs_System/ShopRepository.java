package comp.specs.Computer_Specs_System;

import comp.specs.Computer_Specs_System.PcShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<PcShop, Integer> {
}
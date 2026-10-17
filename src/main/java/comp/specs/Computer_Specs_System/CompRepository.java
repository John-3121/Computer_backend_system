package comp.specs.Computer_Specs_System;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompRepository extends JpaRepository<Computer, Integer> {
    List<Computer> findByShopId(Integer shopId);

    Optional<Computer> findByIdAndShopId(Integer id, Integer shopId);
}

package comp.specs.Computer_Specs_System;

import comp.specs.Computer_Specs_System.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompRepository extends JpaRepository<Computer, Integer> {
}
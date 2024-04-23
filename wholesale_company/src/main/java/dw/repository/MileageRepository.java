package dw.repository;

import dw.model.Mileage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MileageRepository extends JpaRepository<Mileage, Long> {
    List<Mileage> findByMileage(Mileage mileage);
}

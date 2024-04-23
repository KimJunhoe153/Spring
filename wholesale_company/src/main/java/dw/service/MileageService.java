package dw.service;

import dw.model.Mileage;
import dw.repository.MileageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MileageService {
    @Autowired
    MileageRepository mileageRepository;

    public List<Mileage> getAllMileage() {
        return mileageRepository.findAll();
    }

    public Mileage saveMileage(Mileage mileage) {
        return mileageRepository.save(mileage);
    }
}
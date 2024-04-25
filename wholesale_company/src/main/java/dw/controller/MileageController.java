package dw.controller;

import dw.model.Mileage;
import dw.service.MileageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MileageController {
    @Autowired
    MileageService mileageService;

    @GetMapping("/mileages")
    public ResponseEntity<List<Mileage>> getMileageAll() {
        return new ResponseEntity<>(mileageService.getMileageAll(),
                HttpStatus.OK);
    }
}
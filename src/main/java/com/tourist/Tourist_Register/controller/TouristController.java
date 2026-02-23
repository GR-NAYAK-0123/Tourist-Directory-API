package com.tourist.Tourist_Register.controller;

import com.tourist.Tourist_Register.entity.Tourist;
import com.tourist.Tourist_Register.service.ITouristService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tourist-api")
@RequiredArgsConstructor
public class TouristController {
    private final ITouristService touristService;

    @PostMapping("/register")
    public ResponseEntity<?> touristSave(@RequestBody Tourist tourist) throws Exception{
            String resultMessage = touristService.registerTourist(tourist);
            return new ResponseEntity<>(resultMessage, HttpStatus.CREATED);
    }

    @GetMapping("/report")
    public ResponseEntity<?> getAllTourist() throws Exception{
            List<Tourist> list = touristService.gettingAllTourist();
            return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/budget/{start}/{end}")
    public ResponseEntity<?> findTouristByBudget(@PathVariable Double start, @PathVariable Double end) throws Exception{
            List<Tourist> list = touristService.gettingTouristByBudget(start, end);
            return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/package/{packageType}")
    public ResponseEntity<?> findTouristByPackageType(@PathVariable String packageType) throws Exception{
            List<Tourist> list = touristService.gettingTouristByPackageType(packageType);
            return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/Id/{id}")
    public ResponseEntity<?> findTouristById(@PathVariable Integer id) throws Exception{
        Tourist tourist = touristService.gettingTouristById(id);
            return new ResponseEntity<>(tourist, HttpStatus.OK);
    }
}

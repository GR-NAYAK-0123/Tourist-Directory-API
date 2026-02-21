package com.tourist.Tourist_Register.controller;

import com.tourist.Tourist_Register.entity.Tourist;
import com.tourist.Tourist_Register.service.ITouristService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourist-api")
@RequiredArgsConstructor
public class TouristController {
    private final ITouristService touristService;

    @PostMapping("/register")
    public ResponseEntity<?> touristSave(@RequestBody Tourist tourist){
        try {
            String resultMessage = touristService.registerTourist(tourist);
            return new ResponseEntity<>(resultMessage, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/report")
    public ResponseEntity<?> getAllTourist(){
        try {
            List<Tourist> list = touristService.gettingAllTourist();
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/budget/{start}/{end}")
    public ResponseEntity<?> findTouristByBudget(@PathVariable Double start, @PathVariable Double end){
        try {
            List<Tourist> list = touristService.gettingTouristByBudget(start, end);
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

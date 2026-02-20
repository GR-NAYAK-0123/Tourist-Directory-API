package com.tourist.Tourist_Register.controller;

import com.tourist.Tourist_Register.entity.Tourist;
import com.tourist.Tourist_Register.service.ITouristService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

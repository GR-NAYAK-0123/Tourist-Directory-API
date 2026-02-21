package com.tourist.Tourist_Register.service;

import com.tourist.Tourist_Register.entity.Tourist;
import com.tourist.Tourist_Register.repository.ITouristRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("touristService")
@RequiredArgsConstructor
public class TouristServiceImpl implements ITouristService{
    private final ITouristRepository touristRepo;

    //This method store/save the tourist details in the database
    @Override
    public String registerTourist(Tourist tourist) {
        Integer touristId = touristRepo.save(tourist).getId();
        return "Tourist details saved with id : "+touristId;
    }

    //This method gives all the tourists data
    @Override
    public List<Tourist> gettingAllTourist() {
        return touristRepo.findAll();
    }

    @Override
    public List<Tourist> gettingTouristByBudget(Double start, Double end) {
        return touristRepo.getTouristByBudget(start, end);
    }
}

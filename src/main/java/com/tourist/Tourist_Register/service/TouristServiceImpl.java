package com.tourist.Tourist_Register.service;

import com.tourist.Tourist_Register.entity.Tourist;
import com.tourist.Tourist_Register.repository.ITouristRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}

package com.tourist.Tourist_Register.service;

import com.tourist.Tourist_Register.entity.Tourist;

import java.util.List;
import java.util.Optional;

public interface ITouristService {
    public String registerTourist(Tourist tourist);
    public List<Tourist> gettingAllTourist();
    public List<Tourist> gettingTouristByBudget(Double start, Double end);
    public List<Tourist> gettingTouristByPackageType(String packageType);
    public Optional<Tourist> gettingTouristById(Integer id);
}

package com.tourist.Tourist_Register.service;

import com.tourist.Tourist_Register.entity.Tourist;

import java.util.List;

public interface ITouristService {
    public String registerTourist(Tourist tourist);
    public List<Tourist> gettingAllTourist();
}

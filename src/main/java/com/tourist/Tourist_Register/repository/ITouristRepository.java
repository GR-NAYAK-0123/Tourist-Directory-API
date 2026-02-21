package com.tourist.Tourist_Register.repository;

import com.tourist.Tourist_Register.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

    @Query("from Tourist where budget between :start and :end")
    public List<Tourist> getTouristByBudget(Double start, Double end);
}

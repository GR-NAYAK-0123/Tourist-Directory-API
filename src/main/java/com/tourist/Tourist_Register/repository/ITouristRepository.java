package com.tourist.Tourist_Register.repository;

import com.tourist.Tourist_Register.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {

    @Query("from Tourist where budget between :start and :end")
    public List<Tourist> getTouristByBudget(Double start, Double end);

    public List<Tourist> getByPackageType(String packageType);
}

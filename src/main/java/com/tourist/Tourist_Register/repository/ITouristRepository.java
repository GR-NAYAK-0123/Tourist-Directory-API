package com.tourist.Tourist_Register.repository;

import com.tourist.Tourist_Register.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITouristRepository extends JpaRepository<Tourist, Integer> {
}

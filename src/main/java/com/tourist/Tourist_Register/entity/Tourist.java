package com.tourist.Tourist_Register.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "Tourist_Register")
@NoArgsConstructor
@AllArgsConstructor
public class Tourist {
    @Id
    @SequenceGenerator(name = "gen1", sequenceName = "Tourist_Register_SEQ", initialValue = 1000, allocationSize = 2)
    @GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NonNull
    @Column(length = 20)
    private String name;

    @NonNull
    @Column(length = 20)
    private String address;

    @NonNull
    @Column(length = 20)
    private String packageType;

    @NonNull
    private Double budget;

    @NonNull
    private LocalDate startingDate;

    @NonNull
    private LocalDate endingDate;
}

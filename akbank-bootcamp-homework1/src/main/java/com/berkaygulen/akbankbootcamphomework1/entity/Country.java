package com.berkaygulen.akbankbootcamphomework1.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Country_Table")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Country_Name")
    private String name;
    @Column(name = "President")
    private String president;
}

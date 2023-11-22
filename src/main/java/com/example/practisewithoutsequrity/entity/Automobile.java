package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@Setter
@Getter
public class Automobile {


    @Id
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "color")
    private String color;

    @Column(name = "count_place")
    private Integer count_place;

    public Automobile() {

    }

    @ManyToMany(mappedBy = "auto")
    private List<User> users = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "drive_id")
    private Drive drive;
}

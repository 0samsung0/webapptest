package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "Location")
public class Location {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "location_id")
    Integer id;
    @Column(name = "start_location")
    String start_location;
    @Column(name = "finish_location")
    String finish_location;
    @Column(name = "start_time")
    String start_time;
    @Column(name = "finish_time")
    String finish_time;

    public Location() {}


    @OneToOne(mappedBy = "location")
    Drive drive;


}

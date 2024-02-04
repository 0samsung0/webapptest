package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Drive {


    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "count_place")
    private String count_place;
    @Column(name = "status")
    private String status;
    @Column(name = "car_id")
    private Integer car_id;
    @Column(name = "Title")
    private String title;

    public Drive() {}

    public Drive(Integer i){
        this.id = i;
    }

    @ManyToMany(mappedBy = "drive")
    //@JoinColumn(name = "user")
    private List<User> users;

    @OneToMany(mappedBy = "drive")
    private List<Automobile> auto;

    @OneToOne
    private Location location;

    @OneToMany(mappedBy = "drive")
    private List<Task> task;


}

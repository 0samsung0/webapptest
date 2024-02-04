package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "Task")
public class Task {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "bio")
    private String Bio;
    @Column(name = "lvl_important")
    private Integer lvl_important;

    public Task() {}


    @ManyToOne
    @JoinColumn(name = "task")
    private Drive drive;

}

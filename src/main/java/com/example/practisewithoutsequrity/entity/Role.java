package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Admin")
public class Role {

    @Column(name = "admin_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_role")
    private String name;

    public Role() {}

    @OneToMany(mappedBy = "role")
    @Column(name = "id_user")
    private List<User> users;



}

package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Entity
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Role() {}

    @OneToMany(mappedBy = "role")
    @Column(name = "id_user")
    private List<User> users;

    public Role(String r) {
        this.name = r;
    }

    public String toString(){
        return name;
    }

}

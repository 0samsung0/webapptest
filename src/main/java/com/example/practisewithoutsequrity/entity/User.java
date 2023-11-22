package com.example.practisewithoutsequrity.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@Setter
@Getter
@Table(name = "Users")
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name = "position")
    private String position;
    @Column(name = "password")
    private String password;
    @Column(name = "login")
    private String login;



    public User() {}

    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;

    //@ManyToMany(mappedBy = "auto", cascade = CascadeType.ALL)
    @ManyToMany
    @JoinTable(
            name = "user_auto",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "auto_id")
    )
    private List<Automobile> auto;

    @ManyToMany
    @JoinTable(
            name = "ride_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "drive_id")
    )
    private List<Drive> drive;
}

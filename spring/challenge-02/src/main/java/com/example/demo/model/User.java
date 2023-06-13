package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "users")
public class User {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private long Id;

    @Column(name = "email", nullable = false)
    private String Email;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "password", nullable = false)
    private String Password;
}

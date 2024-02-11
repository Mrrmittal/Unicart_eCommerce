package com.unicart.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "role_name", length = 40, nullable = false)
    private String name;

    @Column(name = "role_description", length = 150, nullable = false)
    private String description;

}

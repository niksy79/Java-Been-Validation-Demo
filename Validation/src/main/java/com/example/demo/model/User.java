package com.example.demo.model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    @Size(min = 4, message = "name should be at least 4 characters")
    private String name;
    @NotEmpty
    @Size(min = 4, message = "should be at least 4 characters")
    private String password;
    @Email
    private String email;


}

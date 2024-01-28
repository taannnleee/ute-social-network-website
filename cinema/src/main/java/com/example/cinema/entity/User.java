package com.example.cinema.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "user")
public class User {
    @Id
    private long id;

    @Column(name = "ten")
    private String ten;
    @Column(name = "age")
    private String age;
    @Column(name = "email")
    private String email;
    @Column(name = "pass")
    private String pass;
}

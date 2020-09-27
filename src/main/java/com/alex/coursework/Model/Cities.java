package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCity;
    private String nameCity;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToMany(mappedBy="city", fetch = FetchType.EAGER)
    private Set<Users> users;
}

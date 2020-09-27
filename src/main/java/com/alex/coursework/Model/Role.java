package com.alex.coursework.Model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idRole;
    @NotNull
    private String roleName;
    @NotNull
    private String displayName;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToMany(mappedBy="idRole", fetch = FetchType.EAGER)
    private Set<Users> users;
}

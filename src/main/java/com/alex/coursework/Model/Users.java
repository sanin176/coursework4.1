package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String password;
    private Date dateBirth;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_city", insertable = false, updatable = false)
    private Cities city;

    @OneToMany(mappedBy="user", fetch = FetchType.EAGER)
    private Set<Phone> phone;

    @OneToMany(mappedBy="user", fetch = FetchType.EAGER)
    private Set<Email> email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_role")
    private Role idRole;

    @OneToMany(mappedBy="user", fetch = FetchType.EAGER)
    private Set<CreditCard> creditCard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_basket")
    private Basket basket;
}

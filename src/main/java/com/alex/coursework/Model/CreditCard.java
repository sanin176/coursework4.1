package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCreditCard;
    private String numberCard;
    private String checkCode;
    private String expirationDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToOne(mappedBy = "creditCard")
    private Users user;
}

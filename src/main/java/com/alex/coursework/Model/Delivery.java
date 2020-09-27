package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelivery;
    private double totalWeight;
    private LocalDate deliveryDate;
    private double cost;
    private String deliveryStatus;
    private String typeDelivery;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToOne(mappedBy = "delivery")
    private Orders orders;
}

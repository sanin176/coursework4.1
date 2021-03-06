package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    private LocalDate orderDate;
    private Time orderTime;
    private String statusOrder;
    private double orderCost;
    private String paymentMethod;
    private String obtainingMethod;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_manufacture", insertable = false, updatable = false)
    private Manufacture id_manufacture;

    @OneToMany(mappedBy="id_orders", fetch = FetchType.EAGER)
    private Set<OrdersProdManu> orders;

}

package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequest;
    private Date dateOrder;
    private String address;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToMany(mappedBy="id_request", fetch = FetchType.EAGER)
    private Set<RequestOrders> idRequestOrders;

    @OneToMany(mappedBy="id_request", fetch = FetchType.EAGER)
    private Set<RequestProdManu> idRequestProdManu;
}

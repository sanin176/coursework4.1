package com.alex.coursework.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class RequestProdManu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRequestProdManu;
    private Date amount;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_request", insertable = false, updatable = false)
    private Request id_request;

    @JsonIgnore
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_product_manufacture", insertable = false, updatable = false)
    private ProductManufacture id_product_manufacture;
}

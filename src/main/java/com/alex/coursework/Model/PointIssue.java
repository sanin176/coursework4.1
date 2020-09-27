package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class PointIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhone;
    private String pointName;
    private String pointAddress;
    private String workingHours;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @OneToMany(mappedBy="pointIssue", fetch = FetchType.EAGER)
    private Set<PointIssuePhone> pointIssuePhones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_order")
    private Orders order;
}

package com.alex.coursework.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class PointIssuePhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhone;
    private String phone;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_point_issue")
    private PointIssue pointIssue;
}

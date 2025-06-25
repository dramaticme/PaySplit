package com.paysplit.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double amount;

    @ManyToOne
    private User paidBy;

    @ManyToOne
    private Group group;

    private LocalDateTime timestamp;

    // getters & setters
}


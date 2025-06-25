package com.paysplit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;
@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

    @ManyToOne
    private User createdBy;

    @ManyToMany
    private List<User> members;

    // getters & setters
}

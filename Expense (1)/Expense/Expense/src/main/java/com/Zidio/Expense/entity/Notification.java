package com.Zidio.Expense.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message;
    private Boolean isRead = false;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

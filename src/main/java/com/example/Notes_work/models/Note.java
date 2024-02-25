package com.example.Notes_work.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String heading;

    @Column(nullable = false)
    private String contest;

    private LocalDateTime dateCreate;
}

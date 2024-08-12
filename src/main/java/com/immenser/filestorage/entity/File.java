package com.immenser.filestorage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "file")
public class File {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String file;

    private String title;

    @Column(name = "creation_date")
    @JsonProperty("creation_date")
    private Timestamp creationDate;

    @Column(columnDefinition = "TEXT")
    private String description;
}

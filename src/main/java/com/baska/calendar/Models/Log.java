package com.baska.calendar.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Log {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name =  "id", columnDefinition = "VARCHAR(255)",updatable = false,nullable = false)
    private String id;
    private Operation operation;
    private String objectId;
    private Instant timestamp = Instant.now();
    private String payload;
    private String userId;
    private Object object;
}

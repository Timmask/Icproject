package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="request_log",schema = "log")
public class RequestLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="run_id")
    private String run_id;

    @Column(name="endpoint")
    private String endpoint;

    @Column(name="body")
    private String body;

//    @Column(name="timestamp")
//    private Instant timestamp;

}

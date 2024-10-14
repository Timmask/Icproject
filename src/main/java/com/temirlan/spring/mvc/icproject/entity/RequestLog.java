package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnTransformer;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="test_request_log")
public class RequestLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="run_id")
    private String runId;

    @Column(name="method")
    private String method;

    @ColumnTransformer(write = "COALESCE (? , DATE_ADD(NOW(), INTERVAL 2 HOUR))")
    @Column(name="time_stamp")
    private String timeStamp;

    @Column(name="endpoint")
    private String endpoint;

    @Column(name="body")
    private String body;

//    @Column(name="timestamp")
//    private Instant timestamp;

}

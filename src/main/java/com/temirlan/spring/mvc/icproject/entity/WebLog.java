package com.temirlan.spring.mvc.icproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Generated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "web_log",schema = "log")
public class WebLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="run_id")
    private String run_id;

    @Column(name="method")
    private String method;

    @ColumnTransformer(write = "COALESCE (? , dateadd(hour, 5,CURRENT_TIMESTAMP))")
    @Column(name="time_stamp")
    private String timeStamp;

    @Column(name="url")
    private String url;

    @Column(name="req_body")
    private String reqBody;

    @Column(name="req_info")
    private String reqInfo;

    @Column(name="res_body")
    private String resBody;


}

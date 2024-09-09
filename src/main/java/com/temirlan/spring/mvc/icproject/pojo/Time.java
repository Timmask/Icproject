package com.temirlan.spring.mvc.icproject.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    private Double start;
    private Double finish;
    private Double duration;
    private Double processing;
    private String date_start;
    private String date_finish;
    private Long operating_reset_at;
    private Integer operating;
}

package com.temirlan.spring.mvc.icproject.test;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimeInfo {
    private double start;
    private double finish;
    private double duration;
    private double processing;
    private String date_start;
    private String date_finish;
    private int operating_reset_at;
    private int operating;
}

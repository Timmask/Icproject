package com.temirlan.spring.mvc.icproject.test;


import com.temirlan.spring.mvc.icproject.entity.Deal;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDeal {
    private Deal result;
    private TimeInfo time;
}

package com.temirlan.spring.mvc.icproject.pojo;

import com.temirlan.spring.mvc.icproject.entity.Deal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DealResponse {
    private Deal result;
    private Time time;

}

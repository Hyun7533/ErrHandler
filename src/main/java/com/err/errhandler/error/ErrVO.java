package com.err.errhandler.error;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class ErrVO {
    private String num1;
    private String num2;

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }
}

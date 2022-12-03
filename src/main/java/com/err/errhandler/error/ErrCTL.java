package com.err.errhandler.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class ErrCTL {

    @PostMapping("/test")
    public void test(@RequestBody ErrVO errVO) {

    }

    // POST 요청, @RequestParam Example
    @PostMapping("/test2")
    public ErrVO test2(@RequestBody ErrVO errVO) {
        ErrVO errVO1 = ErrVO.builder().num1("string").build();
        return errVO1;
    }
}

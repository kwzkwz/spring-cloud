package com.cqie.controller;

import com.cqie.api.FeignTestService;
import com.cqie.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/")
public class FeignTestController {
    @Autowired
    private FeignTestService feignTestService;

    @GetMapping("/hello")
    public Result hello() {
        System.out.println("调用coustmer-client成功");
        return feignTestService.hello();
    }
}

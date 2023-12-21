package com.cqie.controller;

import com.cqie.api.ProviderServceApi;
import com.cqie.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider/")
public class ProviderController {
    @Autowired
    private ProviderServceApi providerApi;

    @GetMapping("hello")
    public Result hello() {
        System.out.println("调用成功ProviderController.hello");
        return providerApi.testProvider();
    }

    @GetMapping("hello1")
    public String hello1() {
        return "调用成功ProviderController.hello";
    }
}

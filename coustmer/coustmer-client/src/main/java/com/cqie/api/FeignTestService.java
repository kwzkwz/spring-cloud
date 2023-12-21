package com.cqie.api;

import com.cqie.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "provider-server", url = "http://localhost:8088", path = "/provider/")
public interface FeignTestService {
    @GetMapping("hello")
    Result hello();
}

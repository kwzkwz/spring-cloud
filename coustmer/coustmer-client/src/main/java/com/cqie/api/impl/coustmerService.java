package com.cqie.api.impl;

import com.cqie.api.FeignTestService;
import com.cqie.pojo.Result;
import org.springframework.stereotype.Service;

@Service
public class coustmerService implements FeignTestService {

    @Override
    public Result hello() {
        return null;
    }
}

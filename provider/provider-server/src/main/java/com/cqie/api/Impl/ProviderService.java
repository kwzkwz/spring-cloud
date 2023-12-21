package com.cqie.api.Impl;

import com.cqie.api.ProviderServceApi;
import com.cqie.pojo.Result;
import org.springframework.stereotype.Service;

@Service
public class ProviderService implements ProviderServceApi {
    @Override
    public Result testProvider() {
        return new Result(200,"success","调用provider-server成功");
    }
}

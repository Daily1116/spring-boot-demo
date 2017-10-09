package com.spring.boot.demo.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.boot.demo.dubbo.DubboProviderService;

/**
 * Created by dailongyao on 2017/9/21.
 */
@Service(version = "1.0.0")
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public Integer add(int a, int b) {
        return a + b;
    }
}

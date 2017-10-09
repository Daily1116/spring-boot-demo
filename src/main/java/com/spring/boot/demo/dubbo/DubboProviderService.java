package com.spring.boot.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by dailongyao on 2017/9/21.
 */

public interface DubboProviderService {
    public Integer add(int a,int b);
}

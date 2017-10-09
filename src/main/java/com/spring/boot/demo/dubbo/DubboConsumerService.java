package com.spring.boot.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Component;

/**
 * Created by dailongyao on 2017/9/21.
 */
@Component
public class DubboConsumerService {
    //此处引入服务提供者消费
//    @Reference(version = "1.0.0")
//    public DemoExport demoExport;
}

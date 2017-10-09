package com.spring.boot.demo.weixin.handler;

import me.chanjar.weixin.mp.api.WxMpMessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 处理微信推送消息的处理器抽象类
 * Created by dailongyao on 2017/9/27.
 */
public abstract class AbstractHandler implements WxMpMessageHandler{
    protected Logger logger = LoggerFactory.getLogger(getClass());
}

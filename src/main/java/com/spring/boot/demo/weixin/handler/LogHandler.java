package com.spring.boot.demo.weixin.handler;

import com.spring.boot.demo.weixin.util.JsonUtils;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 记录微信推送过来的消息日志处理器
 * Created by dailongyao on 2017/9/27.
 */
@Component
public class LogHandler extends AbstractHandler{
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {
        this.logger.info("接收到请求消息，内容：{}", JsonUtils.toJson(wxMessage));
        return null;
    }
}

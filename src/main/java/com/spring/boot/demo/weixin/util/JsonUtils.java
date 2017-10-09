package com.spring.boot.demo.weixin.util;

import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

/**
 * Json工具类
 */
public class JsonUtils {
    public static String toJson(Object obj) {
        return WxMpGsonBuilder.create().toJson(obj);
    }
}

package com.kingdee.youshang.katcat.sender;

import com.kingdee.youshang.katcat.entity.MetaMessage;

/**
 * 抽象出一个消息发送类
 * 用于与具体的消息中间件解耦
 */
@FunctionalInterface
public interface Sender {

    String send(MetaMessage MetaMessage) throws Exception;
}

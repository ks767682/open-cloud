package com.unicom.msg.server.exchanger;


import com.unicom.msg.client.model.BaseMessage;

/**
 * @author woodev
 */

public interface MessageExchanger {

    boolean support(Object message);

    boolean exchange(BaseMessage message);
}

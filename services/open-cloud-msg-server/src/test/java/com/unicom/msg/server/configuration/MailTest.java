package com.unicom.msg.server.configuration;

import com.unicom.common.test.BaseTest;
import com.unicom.msg.client.model.EmailMessage;
import com.unicom.msg.server.dispatcher.MessageDispatcher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: liuyadu
 * @date: 2018/11/27 14:45
 * @description:
 */
public class MailTest extends BaseTest {
    @Autowired
    private MessageDispatcher dispatcher;

    @Test
    public void testMail() {
        EmailMessage message = new EmailMessage();
        message.setTo(new String[]{"515608851@qq.com"});
        message.setSubject("测试");
        message.setContent("测试内容");
        this.dispatcher.dispatch(message);
        try {
            Thread.sleep(50000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

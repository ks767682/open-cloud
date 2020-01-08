package com.unicom.msg.server.service;

import com.unicom.msg.client.model.SmsMessage;

/**
 * @author woodev
 */
public interface SmsSender {

	/**
	 * 发送短信
	 * @param parameter
	 * @return
	 */
	Boolean send(SmsMessage parameter);
}

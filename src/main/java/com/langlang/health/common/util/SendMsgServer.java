package com.langlang.health.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tyj on 2018/08/15.
 */
public class SendMsgServer {

	private static final Logger logger = LoggerFactory
			.getLogger(SendMsgServer.class);

	/**
	 * @param messageStr 发送的消息
	 * @param phoneNum   发送的手机号
	 * @return  发送成功返回:ok，发送失败返回:no
	 */
	public static String SendMsg(String messageStr, String phoneNum) {
		//TODO
		return "ok";
	}

}

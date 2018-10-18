package com.unicom.wobeyond.constant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 应用程序系统常量类
 * 
 *
 */
public interface ApplicationConstant {

	/**
	 * 返回键的字段
	 */
	public static final String RETURN_KEY = "result";

	/**
	 * 返回内容的字段
	 */
	public static final String RETURN_MESSAGE = "msg";

	/**
	 * 页面返回成功状态
	 */
	public static final String RESULT_SUCCESS = "1";

	/**
	 * 页面返回失败状态
	 */
	public static final String RESULT_FALTURE = "0";

	/**
	 * 长度为0的常量定义
	 */
	public static final Integer SIZE_OF_LENGTH_ZERO = 0;

	/**
	 * 编码字符串
	 */
	public static final String CHARSET_CODEING = "UTF-8";

	/**
	 * 配置文件名称
	 */
	public static final String CONF_NAME = "conf.properties";
	
	
	/**
	 * 默认账户名称
	 */
	public static final String DEFALUT_HOST = "admin";
	
	
	public static final Integer DEFALUT_VALUE_0 = 0;
	
	public static final Integer DEFALUT_VALUE_1 = 1;
	
	
	public static final Integer DEFALUT_VALUE_2 = 2;
	
	
	/**
	 * 有效时间点
	 */
	public static final Integer VALIDATE_TIME_LIMIT = 17;

	/**
	 * 日期格式化常量
	 */
	public static final DateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd");

	/**
	 * 日期时间格式化常量
	 */
	public static final DateFormat dateTimeFormat = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	
	//存储当前登录账号最新的状态
	public static Map<String,String> status = new HashMap<String,String>();
	
	


}

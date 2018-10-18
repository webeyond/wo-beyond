package com.unicom.wobeyond.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

/**
* @ClassName: BaseRespVO
* @Description: TODO(Controller所有输出VO父类)
*/
@JsonInclude(Include.NON_NULL)
public class BaseRespVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 返回状态
	 */
	private String result;
	/**
	 * 返回消息
	 */
	private String msg;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}

package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.service.AccountService;
import com.unicom.wobeyond.vo.BaseRespVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private AccountService accountService;

	@ResponseBody
	@RequestMapping(value = "v1/login")
	public BaseRespVO login(@RequestBody Account account, HttpSession session) {
		BaseRespVO respVO = new BaseRespVO();
		try {
			respVO = accountService.login(account);
		} catch (Exception e) {
			e.printStackTrace();
			respVO.setMsg(e.getMessage());
			respVO.setResult(ApplicationConstant.RESULT_FALTURE);
			logger.error(e.getMessage());
		}
		return respVO;
	}

	@ResponseBody
	@RequestMapping(value = "v1/logout")
	public BaseRespVO logout(HttpSession session) {
		BaseRespVO respVo = new BaseRespVO();
		session.removeAttribute("userid");
		session.removeAttribute("username");
		return respVo;
	}
}

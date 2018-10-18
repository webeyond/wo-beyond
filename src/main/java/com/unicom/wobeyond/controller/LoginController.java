package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.service.AccountService;
import com.unicom.wobeyond.vo.BaseRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@Api(value = "LoginController",description = "登录接口")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private AccountService accountService;

	@ResponseBody
	@RequestMapping(value = "v1/login", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "登录入参", dataType = "Account")
    @ApiOperation(value="登录接口", response = BaseRespVO.class)
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
	@RequestMapping(value = "v1/logout", method= RequestMethod.POST)
    @ApiOperation(value="登出接口", response = BaseRespVO.class)
	public BaseRespVO logout(HttpSession session) {
		BaseRespVO respVo = new BaseRespVO();
		session.removeAttribute("userid");
		session.removeAttribute("username");
		return respVo;
	}
}

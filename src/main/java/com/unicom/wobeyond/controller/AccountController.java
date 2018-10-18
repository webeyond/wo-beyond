package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.service.AccountService;
import com.unicom.wobeyond.vo.BaseRespVO;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.account.AccountVO;
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

@Controller
@RequestMapping(value = "account")
@Api(value = "AccountController",description = "用户接口")
public class AccountController {

    private static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;


    /**
     * @param reqVO
     * @return BaseRespVO
     * @Title: insertAccount
     * @Description: 增加用户
     */
    @ResponseBody
    @RequestMapping(value = "v1/insertAccount", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "新增用户入参", dataType = "Account")
    @ApiOperation(value="新增用户接口", response = BaseRespVO.class)
    public BaseRespVO insertAccount(@RequestBody Account reqVO) {
        try {
            return accountService.insertAccount(reqVO);
        } catch (Exception e) {
            BaseRespVO respVO = new BaseRespVO();
            e.printStackTrace();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }


    /**
     * @param reqVO
     * @return BaseRespVO
     * @Title: updateAccount
     * @Description: 修改用户
     */
    @ResponseBody
    @RequestMapping(value = "v1/updateAccount", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "编辑用户入参", dataType = "Account")
    @ApiOperation(value="编辑用户接口", response = BaseRespVO.class)
    public BaseRespVO updateAccount(@RequestBody Account reqVO) {
        try {
            return accountService.updateAccount(reqVO);
        } catch (Exception e) {
            e.printStackTrace();
            BaseRespVO respVO = new BaseRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @param reqVO
     * @return AccountVO
     * @Title: findAccountById
     * @Description: 查询用户接口
     */
    @ResponseBody
    @RequestMapping(value = "v1/findAccountById", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "查询用户入参", dataType = "Account")
    @ApiOperation(value="查询用户接口", response = AccountVO.class)
    public AccountVO findAccountById(@RequestBody Account reqVO) {
        try {
            return accountService.findAccountById(reqVO);
        } catch (Exception e) {
            e.printStackTrace();
            AccountVO respVO = new AccountVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @param reqVO
     * @return BaseRespVO
     * @Title: deleteAccount
     * @Description: 修改用户标签
     */
    @ResponseBody
    @RequestMapping(value = "v1/deleteAccount", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "删除用户入参", dataType = "Account")
    @ApiOperation(value="删除用户接口", response = BaseRespVO.class)
    public BaseRespVO deleteAccount(@RequestBody Account reqVO) {
        try {
            return accountService.deleteAccount(reqVO);
        } catch (Exception e) {
            e.printStackTrace();
            BaseRespVO respVO = new BaseRespVO();
            respVO.setMsg(e.getMessage());
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(respVO.getMsg());
            return respVO;
        }
    }

    /**
     * @param req
     * @param page
     * @param pageSize
     * @return PaginaionVO<Account>
     * @Title: selectAccountList
     * @Description: 查询用户列表
     */
    @ResponseBody
    @RequestMapping(value = "v1/findAccountList", method= RequestMethod.POST)
    @ApiImplicitParam(name = "reqVO", value = "查询用户列表入参", dataType = "Account")
    @ApiOperation(value="查询用户列表接口", response = PaginaionVO.class)
    public PaginaionVO<Account> findAccountList(@RequestBody Account req, int page, int pageSize) {
        try {
            return accountService.findAccountList(req, page, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            PaginaionVO<Account> paginaionVO = new PaginaionVO<Account>();
            paginaionVO.setMsg(e.getMessage());
            paginaionVO.setResult(ApplicationConstant.RESULT_FALTURE);
            logger.error(paginaionVO.getMsg());
            return paginaionVO;
        }
    }


}


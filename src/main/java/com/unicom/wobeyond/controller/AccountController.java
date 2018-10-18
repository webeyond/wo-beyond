package com.unicom.wobeyond.controller;

import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.service.AccountService;
import com.unicom.wobeyond.vo.BaseRespVO;
import com.unicom.wobeyond.vo.PaginaionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "account")
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
    @RequestMapping(value = "v1/insertAccount")
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
    @RequestMapping(value = "v1/updateAccount")
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
     * @return BaseRespVO
     * @Title: deleteAccount
     * @Description: 修改用户标签
     */
    @ResponseBody
    @RequestMapping(value = "v1/deleteAccount")
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
    @RequestMapping(value = "v1/findAccountList")
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


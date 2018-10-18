package com.unicom.wobeyond.service;

import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.vo.BaseRespVO;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.account.AccountVO;

import java.io.IOException;

/**
 * 用户管理【含操作员、管理员】
 */
public interface AccountService {

    BaseRespVO insertAccount(Account reqVO) throws IOException;

    BaseRespVO updateAccount(Account reqVO) throws IOException;

    BaseRespVO deleteAccount(Account reqVO) throws IOException;

    AccountVO findAccountById(Account reqVO) throws IOException;

    PaginaionVO<Account> findAccountList(Account reqVO, int page, int pageSize) throws Exception;

    BaseRespVO login(Account reqVO) throws IOException;

}

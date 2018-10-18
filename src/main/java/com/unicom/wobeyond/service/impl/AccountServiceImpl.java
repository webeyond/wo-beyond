package com.unicom.wobeyond.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicom.wobeyond.constant.ApplicationConstant;
import com.unicom.wobeyond.controller.AccountController;
import com.unicom.wobeyond.mapper.AccountMapper;
import com.unicom.wobeyond.mapper.ProdMapper;
import com.unicom.wobeyond.model.Account;
import com.unicom.wobeyond.model.AccountExample;
import com.unicom.wobeyond.model.Prod;
import com.unicom.wobeyond.service.AccountService;
import com.unicom.wobeyond.service.FileUploadService;
import com.unicom.wobeyond.util.WoBeyondUtil;
import com.unicom.wobeyond.vo.BaseRespVO;
import com.unicom.wobeyond.vo.PaginaionVO;
import com.unicom.wobeyond.vo.account.AccountVO;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {

    private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public BaseRespVO insertAccount(Account reqVO) throws IOException {

        if(reqVO == null ){
            throw new RuntimeException("请求参数为空！");
        }
        if (StringUtils.isBlank(reqVO.getOperatorname())) {
            throw new RuntimeException("请求参数【用户名】为空！");
        }
        if (StringUtils.isBlank(reqVO.getPasswd())) {
            throw new RuntimeException("请求参数【密码】为空！");
        }

        accountMapper.insertSelective(reqVO);

        BaseRespVO respVO = new BaseRespVO();
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("新增用户成功");
        return respVO;
    }

    @Override
    public BaseRespVO updateAccount(Account reqVO) throws IOException {

        if(reqVO == null ){
            throw new RuntimeException("请求参数为空！");
        }
        if (null == reqVO.getOperatorid()) {
            throw new RuntimeException("请求参数【操作员ID】为空！");
        }

        accountMapper.updateByPrimaryKeySelective(reqVO);

        BaseRespVO respVO = new BaseRespVO();
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("编辑用户成功");
        return respVO;
    }

    @Override
    public BaseRespVO deleteAccount(Account reqVO) throws IOException {

        if(reqVO == null ){
            throw new RuntimeException("请求参数为空！");
        }
        if (null == reqVO.getOperatorid()) {
            throw new RuntimeException("请求参数【操作员ID】为空！");
        }

        accountMapper.deleteByPrimaryKey(reqVO.getOperatorid());

        BaseRespVO respVO = new BaseRespVO();
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("删除用户ID为"+reqVO.getOperatorid()+"的用户成功");
        return respVO;
    }

    @Override
    public AccountVO findAccountById(Account reqVO) throws IOException {

        AccountVO respVO = new AccountVO();
        if(reqVO == null ){
            throw new RuntimeException("请求参数为空！");
        }
        if (null == reqVO.getOperatorid()) {
            throw new RuntimeException("请求参数【操作员ID】为空！");
        }

        Account account = accountMapper.selectByPrimaryKey(reqVO.getOperatorid());

        BeanUtils.copyProperties(account,respVO);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("查询用户成功");
        return respVO;
    }

    @Override
    public PaginaionVO<Account> findAccountList(Account req, int page, int pageSize) throws Exception {
        PaginaionVO<Account> respVO = new PaginaionVO<Account>();
        if(req == null){
            respVO.setResult(ApplicationConstant.RESULT_FALTURE);
            respVO.setMsg("请求参数为空！");
            logger.error(respVO.getMsg());
            return respVO;
        }
        PageHelper.startPage(page, pageSize);

        AccountExample example = new AccountExample();
        AccountExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(req.getOperatorname())) {
            criteria.andOperatornameLike("%" + req.getOperatorname() + "%");
        }
        if (StringUtils.isNotBlank(req.getRole())) {
            criteria.andRoleEqualTo(req.getRole());
        }

        List<Account> list = accountMapper.selectByExample(example);
        PageInfo<Account> pageInfo = new PageInfo<Account>(list);

        respVO.setTotalPage(pageInfo.getPages());
        respVO.setTotal((int) pageInfo.getTotal());
        respVO.setCurrPage(page);
        respVO.setPageSize(pageSize);
        respVO.setRows(list);
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("获取用户列表成功！");
        return respVO;
    }

    @Override
    public BaseRespVO login(Account reqVO) throws IOException {

        if(reqVO == null ){
            throw new RuntimeException("请求参数为空！");
        }
        if (StringUtils.isBlank(reqVO.getOperatorname())) {
            throw new RuntimeException("请求参数【用户名】为空！");
        }
        if (StringUtils.isBlank(reqVO.getPasswd())) {
            throw new RuntimeException("请求参数【密码】为空！");
        }

        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.createCriteria();
        criteria.andOperatornameEqualTo(reqVO.getOperatorname());
        List<Account> list = accountMapper.selectByExample(accountExample);
        if (list == null || list.size() == 0) {
            throw new RuntimeException("用户不存在！");
        } else {
            Account account = list.get(0);
            if (!reqVO.getPasswd().equals(account.getPasswd())) {
                throw new RuntimeException("密码错误！");
            }
        }

        BaseRespVO respVO = new BaseRespVO();
        respVO.setResult(ApplicationConstant.RESULT_SUCCESS);
        respVO.setMsg("登录成功");
        return respVO;
    }
}

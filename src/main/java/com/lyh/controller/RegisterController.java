package com.lyh.controller;

import com.lyh.entity.EasybuyUser;
import com.lyh.mapper.EasybuyUserDAO;
import com.lyh.utils.RespBean;
import com.lyh.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Reader;

@RestController
@CrossOrigin
public class RegisterController {
    @Autowired
    private EasybuyUserDAO userDAO;
    @PostMapping("/register")
    public RespBean register(EasybuyUser user){
        String pwd = user.getPassword();
        user.setPassword(SecurityUtils.md5Hex(pwd));

        int num = userDAO.insert(user);

        if(num>0){
            return RespBean.success(200,"注册成功！");
        }else {
            return RespBean.fail(500,"注册失败!");
        }

    }
}

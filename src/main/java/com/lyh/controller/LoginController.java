package com.lyh.controller;

import com.lyh.entity.EasybuyUser;
import com.lyh.mapper.EasybuyUserDAO;
import com.lyh.utils.RespBean;
import com.lyh.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private EasybuyUserDAO easybuyUserDAO;

    @PostMapping("/login")
    public RespBean login(@RequestParam("loginName") String name,
                          @RequestParam("password") String pwd){

        EasybuyUser easybuyUser = easybuyUserDAO.findByUser(name);
        if(easybuyUser ==null){
            return RespBean.fail(500,"该用户不存在！");
        }else{
            if(easybuyUser.getPassword().equals(SecurityUtils.md5Hex(pwd))){
                return RespBean.success(200,"登陆成功",easybuyUser);
            }else{
                return RespBean.fail(500,"密码错误！");
            }

        }

    }


}

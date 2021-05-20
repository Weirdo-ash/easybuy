package com.lyh.controller;

import com.lyh.entity.EasybuyProductCategory;

import com.lyh.service.MenusService;
import com.lyh.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
@CrossOrigin(value = "http://127.0.0.1:8848")
public class MenusController {
    @Autowired
    private MenusService menusService;

    @GetMapping("/findMenus")
    public RespBean getMenu(){
        List<EasybuyProductCategory> menus = menusService.findMenus();

        return RespBean.success(200,"菜单",menus);
    }

    @GetMapping("/findErjiMenus")
    public RespBean getErji(){
        List<EasybuyProductCategory> list = menusService.getEerji();

        return RespBean.success(200,"二级菜单",list);
    }

}

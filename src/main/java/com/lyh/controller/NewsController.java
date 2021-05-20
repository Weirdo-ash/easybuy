package com.lyh.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyh.entity.EasybuyNews;

import com.lyh.service.NewsService;
import com.lyh.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
@CrossOrigin(value = "http://127.0.0.1:8848")
public class NewsController {
    @Autowired
    private NewsService neswService;

    @GetMapping("/findNews")
    public RespBean findNews(){
        PageHelper.startPage(1,10);
        List<EasybuyNews> list = neswService.findAll();
        PageInfo<EasybuyNews> pageInfo = new PageInfo<>(list);
        return RespBean.success(200,"新闻",pageInfo);
    }
    @GetMapping("/findNewsById/{id}")
    public RespBean findNewsById(@PathVariable("id") Integer id){
        EasybuyNews news = neswService.findById(id);
        return RespBean.success(200,"查询成功",news);
    }


}
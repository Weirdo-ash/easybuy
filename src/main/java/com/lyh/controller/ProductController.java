package com.lyh.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lyh.entity.EasybuyProduct;
import com.lyh.service.ProductService;
import com.lyh.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/detail/{id}")
    public RespBean getDetail(@PathVariable("id") Integer id){

        EasybuyProduct productDetail = productService.findById(id);

        return RespBean.success(200,"详情查询成功",productDetail);
    }
    @GetMapping("/findById/{id}")
    public RespBean getProduct(@PathVariable("id") Integer id){
        PageHelper.startPage(1,20);
        List<EasybuyProduct> products = productService.findByCategoryId2(id);

        PageInfo<EasybuyProduct> pageInfo = new PageInfo<>(products);

        return RespBean.success(200,"商品查询成功",pageInfo);

    }
    @GetMapping("/findBycategory3/{id}")
    public RespBean getPrduct3(@PathVariable("id") Integer id){
        PageHelper.startPage(1,20);

        List<EasybuyProduct> products = productService.findByCategoryId3(id);

        PageInfo<EasybuyProduct> pageInfo = new PageInfo<>(products);

        return RespBean.success(200,"商品查询成功",pageInfo);
    }
    @GetMapping("/findBycategory1/{id}")
    public RespBean getProduct1(@PathVariable("id") Integer id){
        PageHelper.startPage(1,20);

        List<EasybuyProduct> products = productService.findByCategoryLevel1Id(id);

        PageInfo<EasybuyProduct> pageInfo = new PageInfo<>(products);

        return RespBean.success(200,"商品查询成功",pageInfo);
    }
    @GetMapping("/search")
    public RespBean getName(@RequestParam("search") String search){
        PageHelper.startPage(1,20);

        List<EasybuyProduct> products = productService.findByName(search);

        PageInfo<EasybuyProduct> pageInfo = new PageInfo<>(products);

        return RespBean.success(200,"商品查询成功",pageInfo);
    }
}

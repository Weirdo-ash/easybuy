package com.lyh.service;

import com.lyh.entity.EasybuyProduct;

import java.util.List;

public interface ProductService {
    EasybuyProduct findById(Integer id);

    List<EasybuyProduct> findByCategoryId2(Integer id);

    List<EasybuyProduct> findByCategoryId3(Integer id);



    List<EasybuyProduct> findByCategoryLevel1Id(Integer id);

    List<EasybuyProduct> findByName(String search);
}

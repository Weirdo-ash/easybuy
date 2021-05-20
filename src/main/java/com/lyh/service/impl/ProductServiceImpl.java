package com.lyh.service.impl;

import com.lyh.entity.EasybuyProduct;
import com.lyh.mapper.EasybuyProductDAO;
import com.lyh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private EasybuyProductDAO easybuyProductDAO;

    @Override
    public EasybuyProduct findById(Integer id) {
        return easybuyProductDAO.findById(id);
    }

    @Override
    public List<EasybuyProduct> findByCategoryId2(Integer id) {
        return easybuyProductDAO.findByCategoryLevel2Id(id);
    }

    @Override
    public List<EasybuyProduct> findByCategoryId3(Integer id) {
        return easybuyProductDAO.findByCategoryLevel3Id(id);
    }

    @Override
    public List<EasybuyProduct> findByCategoryLevel1Id(Integer id) {
        return easybuyProductDAO.findByCategoryLevel1Id(id);
    }

    @Override
    public List<EasybuyProduct> findByName(String search) {
        return easybuyProductDAO.findBysearch(search);
    }
}

package com.lyh.service.impl;


import com.lyh.entity.EasybuyProduct;
import com.lyh.entity.EasybuyProductCategory;
import com.lyh.mapper.EasybuyProductCategoryDAO;
import com.lyh.mapper.EasybuyProductDAO;
import com.lyh.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MenusServiceImpl implements MenusService {
    @Autowired
    private EasybuyProductCategoryDAO easybuyProductCategoryDao;
    @Autowired
    private EasybuyProductDAO easybuyProductDAO;

    @Override
    public List<EasybuyProductCategory> findMenus() {

        return easybuyProductCategoryDao.findAll();

    }

    @Override
    public List<EasybuyProductCategory> getEerji() {
        List<EasybuyProductCategory> type = easybuyProductCategoryDao.findAllByType();
        for (EasybuyProductCategory e:type) {
            List<EasybuyProductCategory> list = easybuyProductCategoryDao.findByparentId(e.getId());
            List<EasybuyProduct> product = easybuyProductDAO.findByCategoryLevel1Id(e.getId());
            e.setProduct(product);
            e.setList(list);
            for (EasybuyProductCategory ep:list) {
                List<EasybuyProductCategory> byparentId = easybuyProductCategoryDao.findByparentId(ep.getId());


                ep.setList(byparentId);

            }
        }

        return type;
    }
}

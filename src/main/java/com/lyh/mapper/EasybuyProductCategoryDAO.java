package com.lyh.mapper;

import com.lyh.entity.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductCategoryDAO继承基类
 */
public interface EasybuyProductCategoryDAO extends MyBatisBaseDao<EasybuyProductCategory,Integer>{
    List<EasybuyProductCategory> findAll();

    List<EasybuyProductCategory> findAllByType();

    List<EasybuyProductCategory> findByparentId(@Param("id") Integer parentid);
}
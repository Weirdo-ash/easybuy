package com.lyh.mapper;

import com.lyh.entity.EasybuyProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductDAO继承基类
 */
@Repository
public interface EasybuyProductDAO extends MyBatisBaseDao<EasybuyProduct, Integer> {
    List<EasybuyProduct> findByCategoryLevel1Id(@Param("id") Integer id);

    EasybuyProduct findById(@Param("id") Integer id);

    List<EasybuyProduct> findByCategoryLevel2Id(Integer id);


    List<EasybuyProduct> findByCategoryLevel3Id(Integer id);

    List<EasybuyProduct> findBysearch(@Param("search") String search);
}
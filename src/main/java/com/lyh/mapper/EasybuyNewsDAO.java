package com.lyh.mapper;

import com.lyh.entity.EasybuyNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyNewsDAO继承基类
 */
public interface EasybuyNewsDAO {
    List<EasybuyNews> findAll();

    EasybuyNews findById(@Param("id") Integer id);
}
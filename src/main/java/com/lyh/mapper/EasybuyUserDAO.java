package com.lyh.mapper;

import com.lyh.entity.EasybuyUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserDAO继承基类
 */
@Repository
public interface EasybuyUserDAO extends MyBatisBaseDao<EasybuyUser, Integer> {
    EasybuyUser findByUser(@Param("loginName") String name);
}
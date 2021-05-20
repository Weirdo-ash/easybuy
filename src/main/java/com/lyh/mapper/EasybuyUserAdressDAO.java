package com.lyh.mapper;

import com.lyh.entity.EasybuyUserAdress;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserAdressDAO继承基类
 */
@Repository
public interface EasybuyUserAdressDAO extends MyBatisBaseDao<EasybuyUserAdress, Integer> {
}
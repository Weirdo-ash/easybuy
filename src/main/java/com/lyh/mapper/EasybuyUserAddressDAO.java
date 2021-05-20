package com.lyh.mapper;

import com.lyh.entity.EasybuyUserAddress;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserAddressDAO继承基类
 */
@Repository
public interface EasybuyUserAddressDAO extends MyBatisBaseDao<EasybuyUserAddress, Integer> {
}
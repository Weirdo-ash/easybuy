package com.lyh.service;

import com.lyh.entity.EasybuyProductCategory;

import java.util.List;
import java.util.Map;

public interface MenusService {
    List<EasybuyProductCategory> findMenus();

    List<EasybuyProductCategory> getEerji();
}

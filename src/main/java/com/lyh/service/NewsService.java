package com.lyh.service;

import com.lyh.entity.EasybuyNews;

import java.util.List;

public interface NewsService {
    List<EasybuyNews> findAll();

    EasybuyNews findById(Integer id);
}

package com.lyh.service.impl;

import com.lyh.entity.EasybuyNews;
import com.lyh.mapper.EasybuyNewsDAO;
import com.lyh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {
    @Autowired
    private EasybuyNewsDAO easybuyNewsDAO;

    @Override
    public List<EasybuyNews> findAll() {
        return easybuyNewsDAO.findAll();
    }

    @Override
    public EasybuyNews findById(Integer id) {
        return easybuyNewsDAO.findById(id);
    }
}

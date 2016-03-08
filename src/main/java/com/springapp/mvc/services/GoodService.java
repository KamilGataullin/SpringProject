package com.springapp.mvc.services;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Gataullin Kamil
 * 07.03.2016 0:20
 */
@Service
public class GoodService {

    @Autowired
    private GoodRepository goodRepository;

    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }
}

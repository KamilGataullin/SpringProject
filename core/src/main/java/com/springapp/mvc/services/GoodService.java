package com.springapp.mvc.services;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import com.springapp.mvc.repositories.GoodRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Gataullin Kamil
 * 07.03.2016 0:20
 */
@Service
public class GoodService {

    @Autowired
    private GoodRepository goodRepository;

    @Autowired
    private GoodRepositoryCustom goodRepositoryCustom;

    public List<GoodInfo> getListGoodsLikeName(String name) {
        return goodRepositoryCustom.findGoodLikeName(name);
    }

    public GoodInfo getGood(Long goodId) {
        return goodRepository.getGoodById(goodId);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void add(GoodInfo goodInfo) {
        goodRepository.saveAndFlush(goodInfo);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void update(GoodInfo goodInfo) {
        goodRepository.saveAndFlush(goodInfo);
    }

    @Transactional  // оборачивает данный метод в Транзакцию
    public void delete(Long goodId) {
        goodRepository.delete(goodId);
    }

    public List<GoodInfo> find(String name, BigDecimal price) {
        return goodRepository.findGoodsByNameAndPrice(name, price);
    }

}

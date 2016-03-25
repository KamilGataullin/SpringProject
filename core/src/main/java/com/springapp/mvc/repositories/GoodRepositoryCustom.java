package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;

import java.util.List;

/**
 * Gataullin Kamil
 * 25.03.2016 8:27
 */
public interface GoodRepositoryCustom {

    List<GoodInfo> findGoodLikeName(String name);
}

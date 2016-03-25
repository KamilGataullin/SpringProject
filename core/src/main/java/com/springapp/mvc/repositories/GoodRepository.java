package com.springapp.mvc.repositories;

import com.springapp.mvc.common.GoodInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Gataullin Kamil
 * 07.03.2016 0:17
 */
public interface GoodRepository extends JpaRepository<GoodInfo, Long> {

    GoodInfo getGoodById(Long goodId);

    List<GoodInfo> findGoodsByNameAndPrice(String name, BigDecimal price);
}

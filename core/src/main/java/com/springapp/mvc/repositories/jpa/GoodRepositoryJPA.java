package com.springapp.mvc.repositories.jpa;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Gataullin Kamil
 * 25.03.2016 8:28
 */
@Repository
public class GoodRepositoryJPA implements GoodRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<GoodInfo> findGoodLikeName(String name) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<GoodInfo> query = cb.createQuery(GoodInfo.class);
        Root<GoodInfo> sm = query.from(GoodInfo.class);
        query.where(cb.like(sm.<String>get("name"), "%" + name + "%"));
        return entityManager.createQuery(query).getResultList();
    }
}

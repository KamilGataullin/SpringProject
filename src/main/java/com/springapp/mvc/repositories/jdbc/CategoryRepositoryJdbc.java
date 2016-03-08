package com.springapp.mvc.repositories.jdbc;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Gataullin Kamil
 * 08.03.2016 20:35
 */
@Repository
public class CategoryRepositoryJdbc implements CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL_INSERT_CATEGORY =
            "insert into CATEGORY (name) values (?)";

    @Override
    public void addCategory(CategoryInfo categoryInfo) {
        jdbcTemplate.update(SQL_INSERT_CATEGORY, categoryInfo.getName());
    }
}

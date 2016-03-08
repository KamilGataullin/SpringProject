package com.springapp.mvc.repositories.jdbc;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gataullin Kamil
 * 07.03.2016 0:18
 */
@Repository
public class GoodRepositoryJdbc implements GoodRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;

    private static final String SQL_INSERT_GOOD =
            "insert into GOODS (name, description, imageUrl, categoryId, price) values (?, ?, ?, ?, ?)";

    @Override
    public void addGood(GoodInfo goodInfo) {
        jdbcTemplate.update(SQL_INSERT_GOOD,
                goodInfo.getName(),
                goodInfo.getDescription(),
                goodInfo.getImageUrl(),
                goodInfo.getCategory().getId(),
                goodInfo.getPrice());
    }

    private static final String SQL_UPDATE_GOOD =
            "update GOODS set name = :goodname, description = :description, imageUrl = :imageUrl, " +
                    "categoryId = :categoryId, price = :price " +
                    "where id = :goodId";

    @Override
    public void updateGood(GoodInfo goodInfo) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("goodId", goodInfo.getId());
        params.put("goodname", goodInfo.getName());
        params.put("description", goodInfo.getDescription());
        params.put("imageUrl", goodInfo.getImageUrl());
        params.put("categoryId", goodInfo.getCategory().getId());
        params.put("price", goodInfo.getPrice());

        namedJdbcTemplate.update(SQL_UPDATE_GOOD, params);
    }

    @Override
    public void deleteGood(Long goodId) {
        // FIXME
    }

    private static final String SQL_SELECT_GOOD =
            "select g.id, g.name, g.description, g.imageUrl, g.price, c.id as categoryId, c.name as categoryName " +
                    "from GOODS g " +
                    "join CATEGORY c on g.categoryId = c.id " +
                    "where g.id = ?";

    @Override
    public GoodInfo getGoodById(Long goodId) {
        RowMapper<GoodInfo> rm = new RowMapper<GoodInfo>() {
            @Override
            public GoodInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                GoodInfo goodInfo = new GoodInfo();
                goodInfo.setId(rs.getLong("id"));
                goodInfo.setName(rs.getString("name"));
                goodInfo.setDescription(rs.getString("description"));
                goodInfo.setImageUrl(rs.getString("imageUrl"));
                goodInfo.setPrice(rs.getBigDecimal("price"));
                goodInfo.setCategory(new CategoryInfo(rs.getLong("categoryId"), rs.getString("categoryName"), null));
                return goodInfo;
            }
        };
        // queryForObject - всегда возвращает 1 результат, если же в БД будет 0 или более 1 подходящей записи, будет брошено исключение.
        // return jdbcTemplate.queryForObject(SQL_SELECT_GOOD, rm, goodId);

        // поэтому правильнее пользвоваться вот таким способом
        List<GoodInfo> results = jdbcTemplate.query(SQL_SELECT_GOOD, rm, goodId);
        if (results.isEmpty()) {
            return null;
        } else if (results.size() == 1) {
            return results.get(0);
        } else {
            throw new IllegalArgumentException("Your database contains " + results.size() + " goods with id = " + goodId);
        }
    }
}

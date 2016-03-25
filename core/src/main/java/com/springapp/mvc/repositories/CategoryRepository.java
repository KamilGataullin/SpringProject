package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Gataullin Kamil
 * 08.03.2016 20:34
 */
public interface CategoryRepository extends JpaRepository<CategoryInfo, Long> {

    @Query("select c from CategoryInfo c where c.name = :name")
    CategoryInfo findByName(@Param("name") String name);
}

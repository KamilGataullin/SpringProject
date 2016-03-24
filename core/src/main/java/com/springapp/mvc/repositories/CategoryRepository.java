package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Gataullin Kamil
 * 08.03.2016 20:34
 */
public interface CategoryRepository extends JpaRepository<CategoryInfo, Long> {

}

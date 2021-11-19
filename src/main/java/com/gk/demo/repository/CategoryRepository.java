package com.gk.demo.repository;

import com.gk.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category , Integer> {

}

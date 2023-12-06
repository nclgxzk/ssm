package com.how2java.mapper;

import com.how2java.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 不会水的鸭子
 * @description TODO
 * @create 2023-12-05 20:03
 */
@Repository
public interface CategoryMapper {

    public int add(Category category);

    public void delete(int id);

    public Category get(int id);

    public int update(Category category);

    public List<Category> list();


}

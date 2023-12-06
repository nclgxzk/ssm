package com.how2java.service;

import com.how2java.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 不会水的鸭子
 * @description TODO
 * @create 2023-12-05 20:04
 */

public interface CategoryService {
    List<Category> list();
}

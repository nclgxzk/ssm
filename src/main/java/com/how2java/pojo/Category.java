package com.how2java.pojo;

/**
 * @author 不会水的鸭子
 * @description TODO
 * @create 2023-12-05 20:01
 */


public class Category {
    private int id;
    private String name;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

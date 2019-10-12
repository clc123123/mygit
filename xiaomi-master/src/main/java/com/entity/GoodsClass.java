package com.entity;

import lombok.Data;

@Data
public class GoodsClass {
    private int class_id;//商品f分类编号
    private String class_name; //商品分类名
    private int class_cId;// 商品分类推荐

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getClass_cId() {
        return class_cId;
    }

    public void setClass_cId(int class_cId) {
        this.class_cId = class_cId;
    }
}

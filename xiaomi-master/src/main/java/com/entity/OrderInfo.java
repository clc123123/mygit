package com.entity;

import lombok.Data;

@Data
public class OrderInfo {
    private int order_id;//订单id
    private int user_id;//用户id
    private double order_price;//订单价格
    private String order_name;//订单收货人
    private String order_addr;//收货地址
    private String order_phone;//收货人电话
    private String order_tel;//收货人联系电话
    private String order_desc;//订单备注
    private int state;//状态 1:可用状态  0:删除状态'

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getOrder_addr() {
        return order_addr;
    }

    public void setOrder_addr(String order_addr) {
        this.order_addr = order_addr;
    }

    public String getOrder_phone() {
        return order_phone;
    }

    public void setOrder_phone(String order_phone) {
        this.order_phone = order_phone;
    }

    public String getOrder_tel() {
        return order_tel;
    }

    public void setOrder_tel(String order_tel) {
        this.order_tel = order_tel;
    }

    public String getOrder_desc() {
        return order_desc;
    }

    public void setOrder_desc(String order_desc) {
        this.order_desc = order_desc;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

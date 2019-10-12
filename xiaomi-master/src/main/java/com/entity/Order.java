package com.entity;

import lombok.Data;
/*订单实体类*/
@Data
public class Order {
    private int order_id; //订单id
    private String order_sn; //订单号
    private String order_data;//添加日期
    private int goodsid;//商品id
    private String pro_name;//商品名
    private String pro_desc;//商品描述
    private String pro_color;//商品颜色
    private int pro_num;//商品数量
    private double pro_price;//商品单价
    private double tal_price;//订单总计

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public String getOrder_data() {
        return order_data;
    }

    public void setOrder_data(String order_data) {
        this.order_data = order_data;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_desc() {
        return pro_desc;
    }

    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc;
    }

    public String getPro_color() {
        return pro_color;
    }

    public void setPro_color(String pro_color) {
        this.pro_color = pro_color;
    }

    public int getPro_num() {
        return pro_num;
    }

    public void setPro_num(int pro_num) {
        this.pro_num = pro_num;
    }

    public double getPro_price() {
        return pro_price;
    }

    public void setPro_price(double pro_price) {
        this.pro_price = pro_price;
    }

    public double getTal_price() {
        return tal_price;
    }

    public void setTal_price(double tal_price) {
        this.tal_price = tal_price;
    }
}

package com.entity;

import lombok.Data;

@Data
public class GoodsInfo {
    private int goodsID;//商品编号
    private int c_ID; //商品大分类ID
    private String goodsName;//商品名称
    private String goodsIntroduce;//商品描述
    private String service;//服务
    private String goodsImg; //图片
    private String goodsUrl;//图片链接
    private Double marketPrice;//价钱
    private int isNew;//是否是新品
    private int discount;//是否是优惠商品
    private String flag;//商品上下架
    private int class_cId; //商品分类推荐类型 0--不推荐商品 1--左侧商品分类推荐 2--导航商品分类推荐

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public int getC_ID() {
        return c_ID;
    }

    public void setC_ID(int c_ID) {
        this.c_ID = c_ID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getIsNew() {
        return isNew;
    }

    public void setIsNew(int isNew) {
        this.isNew = isNew;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getClass_cId() {
        return class_cId;
    }

    public void setClass_cId(int class_cId) {
        this.class_cId = class_cId;
    }
}

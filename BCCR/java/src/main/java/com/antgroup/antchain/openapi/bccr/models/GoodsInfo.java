// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class GoodsInfo extends TeaModel {
    // 商品id
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("goods_id")
    public String goodsId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("goods_name")
    public String goodsName;

    // 商品状态
    /**
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("goods_status")
    public String goodsStatus;

    // 商品分类
    /**
     * <strong>example:</strong>
     * <p>分类</p>
     */
    @NameInMap("classification")
    public String classification;

    // 售卖数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_sold_num")
    public Long totalSoldNum;

    // 售价（分）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("standard_price_in_cent")
    public Long standardPriceInCent;

    // 商品标题
    /**
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("title")
    public String title;

    // 授权期限起始时间
    @NameInMap("auth_start_time")
    public Long authStartTime;

    // 授权期限结束时间
    @NameInMap("auth_end_time")
    public Long authEndTime;

    // 发布时间
    @NameInMap("publish_time")
    public Long publishTime;

    public static GoodsInfo build(java.util.Map<String, ?> map) throws Exception {
        GoodsInfo self = new GoodsInfo();
        return TeaModel.build(map, self);
    }

    public GoodsInfo setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GoodsInfo setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public GoodsInfo setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
        return this;
    }
    public String getGoodsStatus() {
        return this.goodsStatus;
    }

    public GoodsInfo setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public GoodsInfo setTotalSoldNum(Long totalSoldNum) {
        this.totalSoldNum = totalSoldNum;
        return this;
    }
    public Long getTotalSoldNum() {
        return this.totalSoldNum;
    }

    public GoodsInfo setStandardPriceInCent(Long standardPriceInCent) {
        this.standardPriceInCent = standardPriceInCent;
        return this;
    }
    public Long getStandardPriceInCent() {
        return this.standardPriceInCent;
    }

    public GoodsInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GoodsInfo setAuthStartTime(Long authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public Long getAuthStartTime() {
        return this.authStartTime;
    }

    public GoodsInfo setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public GoodsInfo setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

}

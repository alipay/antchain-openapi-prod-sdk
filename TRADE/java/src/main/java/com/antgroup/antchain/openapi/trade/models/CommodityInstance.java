// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommodityInstance extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>2088123412341234</p>
     */
    @NameInMap("biz_no")
    public String bizNo;

    // 商品编码
    /**
     * <strong>example:</strong>
     * <p>KKAASP00001001</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 销售主体，不传默认ZL6
    /**
     * <strong>example:</strong>
     * <p>ZL6,ZL7,ZJ9</p>
     */
    @NameInMap("ou")
    public String ou;

    // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
    /**
     * <strong>example:</strong>
     * <p>NEW </p>
     */
    @NameInMap("order_type")
    public String orderType;

    // 订购时长
    @NameInMap("duration")
    public OrderDuration duration;

    // 优惠券ID
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("coupon_id")
    public String couponId;

    // 数量，不填默认1
    @NameInMap("quantity")
    public Long quantity;

    // 	
    // 商品订购属性，开通型商品部需要填写
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("commodity_attrs")
    public java.util.List<CommodityOrderAttribute> commodityAttrs;

    // 履约选项
    @NameInMap("fulfillment_options")
    public FulfillmentOptions fulfillmentOptions;

    // 实例ID，续费/变配场景必传
    /**
     * <strong>example:</strong>
     * <p>A0BQBHFM00034877FVDJWUXR1ZXEMOD1U4G</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
    @NameInMap("prepay_amount")
    public PrepayAmount prepayAmount;

    // 后付商品签约价，用于在履约阶段生成一客一价
    @NameInMap("post_pay_price")
    public PostPayPrice postPayPrice;

    public static CommodityInstance build(java.util.Map<String, ?> map) throws Exception {
        CommodityInstance self = new CommodityInstance();
        return TeaModel.build(map, self);
    }

    public CommodityInstance setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CommodityInstance setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CommodityInstance setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public CommodityInstance setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CommodityInstance setDuration(OrderDuration duration) {
        this.duration = duration;
        return this;
    }
    public OrderDuration getDuration() {
        return this.duration;
    }

    public CommodityInstance setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public CommodityInstance setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CommodityInstance setCommodityAttrs(java.util.List<CommodityOrderAttribute> commodityAttrs) {
        this.commodityAttrs = commodityAttrs;
        return this;
    }
    public java.util.List<CommodityOrderAttribute> getCommodityAttrs() {
        return this.commodityAttrs;
    }

    public CommodityInstance setFulfillmentOptions(FulfillmentOptions fulfillmentOptions) {
        this.fulfillmentOptions = fulfillmentOptions;
        return this;
    }
    public FulfillmentOptions getFulfillmentOptions() {
        return this.fulfillmentOptions;
    }

    public CommodityInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CommodityInstance setPrepayAmount(PrepayAmount prepayAmount) {
        this.prepayAmount = prepayAmount;
        return this;
    }
    public PrepayAmount getPrepayAmount() {
        return this.prepayAmount;
    }

    public CommodityInstance setPostPayPrice(PostPayPrice postPayPrice) {
        this.postPayPrice = postPayPrice;
        return this;
    }
    public PostPayPrice getPostPayPrice() {
        return this.postPayPrice;
    }

}

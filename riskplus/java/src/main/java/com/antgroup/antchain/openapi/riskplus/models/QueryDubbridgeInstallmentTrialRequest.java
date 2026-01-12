// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeInstallmentTrialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 业务类型，1：现金贷；2：分期付
    @NameInMap("prod_type")
    @Validation(required = true)
    public String prodType;

    // 资产方购物订单号
    @NameInMap("biz_order_no")
    @Validation(required = true)
    public String bizOrderNo;

    // 天枢客户号
    @NameInMap("customer_no")
    public String customerNo;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 资金方编码
    @NameInMap("fund_code")
    @Validation(required = true)
    public String fundCode;

    // 订单交易金额
    @NameInMap("trade_amount")
    @Validation(required = true)
    public String tradeAmount;

    // 优惠券id
    @NameInMap("coupon_id")
    public String couponId;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    public static QueryDubbridgeInstallmentTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeInstallmentTrialRequest self = new QueryDubbridgeInstallmentTrialRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeInstallmentTrialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeInstallmentTrialRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeInstallmentTrialRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeInstallmentTrialRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeInstallmentTrialRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgeInstallmentTrialRequest setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public QueryDubbridgeInstallmentTrialRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeInstallmentTrialRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeInstallmentTrialRequest setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryDubbridgeInstallmentTrialRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public QueryDubbridgeInstallmentTrialRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

}

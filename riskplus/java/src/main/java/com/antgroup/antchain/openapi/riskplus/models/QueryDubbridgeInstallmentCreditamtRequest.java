// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeInstallmentCreditamtRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号：request请求单号，每次请求唯一，如uuid
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 1：现金贷、2：分期付
    @NameInMap("prod_type")
    @Validation(required = true)
    public String prodType;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 项目编号
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 资产方购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
    @NameInMap("trade_amount")
    public String tradeAmount;

    // 客户姓名
    @NameInMap("customer_name")
    public String customerName;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 流量来源名称，导流平台背后具体的流量名称
    @NameInMap("traffic_source_name")
    public String trafficSourceName;

    // 广告位id，流量来源内各广告位标志
    @NameInMap("traffic_ad_id")
    public String trafficAdId;

    // 营销活动编号
    @NameInMap("traffic_mkt_id")
    public String trafficMktId;

    // 点击id
    @NameInMap("click_id")
    public String clickId;

    public static QueryDubbridgeInstallmentCreditamtRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeInstallmentCreditamtRequest self = new QueryDubbridgeInstallmentCreditamtRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeInstallmentCreditamtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryDubbridgeInstallmentCreditamtRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

}

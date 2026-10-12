// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeInstallmentCreditamtRequest extends TeaModel {
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

    // 导流平台
    @NameInMap("traffic_platform")
    @Validation(required = true)
    public String trafficPlatform;

    // 流量来源名称，导流平台背后具体的流量名称
    @NameInMap("traffic_source_name")
    public String trafficSourceName;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 项目编号（天枢侧提前约定）
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
    @NameInMap("trade_amount")
    public String tradeAmount;

    // 分期金额，单位：元，如99.88（用于筛选额度充足的机构）,分期金额由天枢加工的渠道可不传递
    @NameInMap("installment_amount")
    public String installmentAmount;

    // 资产方购物订单号，如二轮车/摩托车订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 客户姓名
    @NameInMap("customer_name")
    public String customerName;

    // 广告位id，流量来源内各广告位标志
    @NameInMap("traffic_ad_id")
    public String trafficAdId;

    // 营销活动编号
    @NameInMap("traffic_mkt_id")
    public String trafficMktId;

    // 点击id
    @NameInMap("click_id")
    public String clickId;

    // 取消授信额度
    @NameInMap("cancal_credit_line")
    public String cancalCreditLine;

    // 渠道号
    @NameInMap("channel_code")
    public String channelCode;

    public static QueryRiskplusDubbridgeInstallmentCreditamtRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeInstallmentCreditamtRequest self = new QueryRiskplusDubbridgeInstallmentCreditamtRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
        return this;
    }
    public String getInstallmentAmount() {
        return this.installmentAmount;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setCancalCreditLine(String cancalCreditLine) {
        this.cancalCreditLine = cancalCreditLine;
        return this;
    }
    public String getCancalCreditLine() {
        return this.cancalCreditLine;
    }

    public QueryRiskplusDubbridgeInstallmentCreditamtRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}

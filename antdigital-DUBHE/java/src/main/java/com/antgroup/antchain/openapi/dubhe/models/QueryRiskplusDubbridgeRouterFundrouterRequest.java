// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dubhe.models;

import com.aliyun.tea.*;

public class QueryRiskplusDubbridgeRouterFundrouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 1：现金贷（默认）
    // 2：分期付
    @NameInMap("prod_type")
    public String prodType;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    public String openId;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 资产方购物订单号，如二轮车/摩托车订单号；购物场景时传递
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 姓名
    @NameInMap("custom_name")
    public String customName;

    // 默认：0
    // 0：明文
    // 1：md5
    @NameInMap("mobile_type")
    public String mobileType;

    // 默认：0
    // 0：明文
    // 1：md5
    @NameInMap("card_no_type")
    public String cardNoType;

    // 默认：0
    // 0：明文
    // 1：md5
    @NameInMap("custom_name_type")
    public String customNameType;

    // 渠道类型
    @NameInMap("channel_type")
    public String channelType;

    // 客户类型
    @NameInMap("custom_type")
    public String customType;

    // 合作方产品编号
    @NameInMap("prod_no")
    public String prodNo;

    // 授信过期的资金方编码
    @NameInMap("expired_platform_no")
    public String expiredPlatformNo;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 流量名称
    @NameInMap("traffic_source_name")
    public String trafficSourceName;

    // 广告位标志
    @NameInMap("traffic_ad_id")
    public String trafficAdId;

    // 预留
    @NameInMap("traffic_mkt_id")
    public String trafficMktId;

    // 预留
    @NameInMap("click_id")
    public String clickId;

    // 风险字段
    @NameInMap("risk_data")
    public String riskData;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    // 商户入驻id
    @NameInMap("merchant_external_id")
    public String merchantExternalId;

    public static QueryRiskplusDubbridgeRouterFundrouterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusDubbridgeRouterFundrouterRequest self = new QueryRiskplusDubbridgeRouterFundrouterRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }
    public String getMobileType() {
        return this.mobileType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setCardNoType(String cardNoType) {
        this.cardNoType = cardNoType;
        return this;
    }
    public String getCardNoType() {
        return this.cardNoType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setCustomNameType(String customNameType) {
        this.customNameType = customNameType;
        return this;
    }
    public String getCustomNameType() {
        return this.customNameType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setExpiredPlatformNo(String expiredPlatformNo) {
        this.expiredPlatformNo = expiredPlatformNo;
        return this;
    }
    public String getExpiredPlatformNo() {
        return this.expiredPlatformNo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryRiskplusDubbridgeRouterFundrouterRequest setMerchantExternalId(String merchantExternalId) {
        this.merchantExternalId = merchantExternalId;
        return this;
    }
    public String getMerchantExternalId() {
        return this.merchantExternalId;
    }

}

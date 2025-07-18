// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRouterFundrouterRequest extends TeaModel {
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

    public static QueryDubbridgeRouterFundrouterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRouterFundrouterRequest self = new QueryDubbridgeRouterFundrouterRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRouterFundrouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRouterFundrouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRouterFundrouterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeRouterFundrouterRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeRouterFundrouterRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeRouterFundrouterRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeRouterFundrouterRequest setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }
    public String getMobileType() {
        return this.mobileType;
    }

    public QueryDubbridgeRouterFundrouterRequest setCardNoType(String cardNoType) {
        this.cardNoType = cardNoType;
        return this;
    }
    public String getCardNoType() {
        return this.cardNoType;
    }

    public QueryDubbridgeRouterFundrouterRequest setCustomNameType(String customNameType) {
        this.customNameType = customNameType;
        return this;
    }
    public String getCustomNameType() {
        return this.customNameType;
    }

    public QueryDubbridgeRouterFundrouterRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryDubbridgeRouterFundrouterRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public QueryDubbridgeRouterFundrouterRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setExpiredPlatformNo(String expiredPlatformNo) {
        this.expiredPlatformNo = expiredPlatformNo;
        return this;
    }
    public String getExpiredPlatformNo() {
        return this.expiredPlatformNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgeRouterFundrouterRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryDubbridgeRouterFundrouterRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryDubbridgeRouterFundrouterRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryDubbridgeRouterFundrouterRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public QueryDubbridgeRouterFundrouterRequest setRiskData(String riskData) {
        this.riskData = riskData;
        return this;
    }
    public String getRiskData() {
        return this.riskData;
    }

    public QueryDubbridgeRouterFundrouterRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}

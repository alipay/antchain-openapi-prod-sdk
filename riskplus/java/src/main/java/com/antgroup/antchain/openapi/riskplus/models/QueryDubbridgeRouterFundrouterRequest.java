// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRouterFundrouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    @NameInMap("custom_name")
    @Validation(required = true)
    public String customName;

    // 合作方产品编号
    @NameInMap("prod_no")
    public String prodNo;

    // 渠道类型
    @NameInMap("channel_type")
    public String channelType;

    // 客户类型
    @NameInMap("custom_type")
    public String customType;

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

    // 订单号
    @NameInMap("order_no")
    public String orderNo;

    // 风险字段
    @NameInMap("risk_data")
    public String riskData;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

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

    public QueryDubbridgeRouterFundrouterRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeRouterFundrouterRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeRouterFundrouterRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeRouterFundrouterRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
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

    public QueryDubbridgeRouterFundrouterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
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

}

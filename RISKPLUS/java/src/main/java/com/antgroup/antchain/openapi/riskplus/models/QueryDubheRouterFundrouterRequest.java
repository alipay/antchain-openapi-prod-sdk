// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheRouterFundrouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号(md5加密32位)
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 手机号（MD5加密，32位）
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 客户姓名
    @NameInMap("custom_name")
    @Validation(required = true)
    public String customName;

    // 合作方产品编号
    @NameInMap("prod_no")
    @Validation(required = true)
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

    public static QueryDubheRouterFundrouterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheRouterFundrouterRequest self = new QueryDubheRouterFundrouterRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubheRouterFundrouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubheRouterFundrouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubheRouterFundrouterRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubheRouterFundrouterRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubheRouterFundrouterRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubheRouterFundrouterRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public QueryDubheRouterFundrouterRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryDubheRouterFundrouterRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public QueryDubheRouterFundrouterRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubheRouterFundrouterRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryDubheRouterFundrouterRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryDubheRouterFundrouterRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryDubheRouterFundrouterRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditPermitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 身份证号
    @NameInMap("card_no")
    public String cardNo;

    // 手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 姓名
    @NameInMap("custom_name")
    public String customName;

    // 合作方产品编号
    @NameInMap("prod_no")
    public String prodNo;

    // 1:app
    // 2:H5
    @NameInMap("channel_type")
    public String channelType;

    // 客户类型
    // ("1", "新增客户"),("2", "存量激活客户"),("3", "目标营销账户")
    @NameInMap("custom_type")
    public String customType;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 流量来源名称
    @NameInMap("traffic_source_name")
    public String trafficSourceName;

    // 广告位标志
    @NameInMap("traffic_ad_id")
    public String trafficAdId;

    // 营销id
    @NameInMap("traffic_mkt_id")
    public String trafficMktId;

    // 点击id
    @NameInMap("click_id")
    public String clickId;

    public static QueryDubbridgeCreditPermitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditPermitRequest self = new QueryDubbridgeCreditPermitRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditPermitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeCreditPermitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeCreditPermitRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeCreditPermitRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeCreditPermitRequest setCustomName(String customName) {
        this.customName = customName;
        return this;
    }
    public String getCustomName() {
        return this.customName;
    }

    public QueryDubbridgeCreditPermitRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public QueryDubbridgeCreditPermitRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public QueryDubbridgeCreditPermitRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public QueryDubbridgeCreditPermitRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgeCreditPermitRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryDubbridgeCreditPermitRequest setTrafficAdId(String trafficAdId) {
        this.trafficAdId = trafficAdId;
        return this;
    }
    public String getTrafficAdId() {
        return this.trafficAdId;
    }

    public QueryDubbridgeCreditPermitRequest setTrafficMktId(String trafficMktId) {
        this.trafficMktId = trafficMktId;
        return this;
    }
    public String getTrafficMktId() {
        return this.trafficMktId;
    }

    public QueryDubbridgeCreditPermitRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

}

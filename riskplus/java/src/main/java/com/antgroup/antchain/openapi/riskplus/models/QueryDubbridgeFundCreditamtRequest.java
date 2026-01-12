// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeFundCreditamtRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求单号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 业务类型
    @NameInMap("prod_type")
    @Validation(required = true)
    public String prodType;

    // 导流平台
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 流量来源名称
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

    // 手机号加密类型
    @NameInMap("mobile_type")
    @Validation(required = true)
    public String mobileType;

    // 身份证号
    @NameInMap("card_no")
    @Validation(required = true)
    public String cardNo;

    // 身份证号加密类型
    @NameInMap("card_no_type")
    @Validation(required = true)
    public String cardNoType;

    // 客户姓名
    @NameInMap("customer_name")
    @Validation(required = true)
    public String customerName;

    // 客户姓名加密类型
    @NameInMap("custom_name_type")
    @Validation(required = true)
    public String customNameType;

    public static QueryDubbridgeFundCreditamtRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeFundCreditamtRequest self = new QueryDubbridgeFundCreditamtRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeFundCreditamtRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeFundCreditamtRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeFundCreditamtRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDubbridgeFundCreditamtRequest setProdType(String prodType) {
        this.prodType = prodType;
        return this;
    }
    public String getProdType() {
        return this.prodType;
    }

    public QueryDubbridgeFundCreditamtRequest setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgeFundCreditamtRequest setTrafficSourceName(String trafficSourceName) {
        this.trafficSourceName = trafficSourceName;
        return this;
    }
    public String getTrafficSourceName() {
        return this.trafficSourceName;
    }

    public QueryDubbridgeFundCreditamtRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgeFundCreditamtRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryDubbridgeFundCreditamtRequest setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }
    public String getMobileType() {
        return this.mobileType;
    }

    public QueryDubbridgeFundCreditamtRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
    public String getCardNo() {
        return this.cardNo;
    }

    public QueryDubbridgeFundCreditamtRequest setCardNoType(String cardNoType) {
        this.cardNoType = cardNoType;
        return this;
    }
    public String getCardNoType() {
        return this.cardNoType;
    }

    public QueryDubbridgeFundCreditamtRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryDubbridgeFundCreditamtRequest setCustomNameType(String customNameType) {
        this.customNameType = customNameType;
        return this;
    }
    public String getCustomNameType() {
        return this.customNameType;
    }

}

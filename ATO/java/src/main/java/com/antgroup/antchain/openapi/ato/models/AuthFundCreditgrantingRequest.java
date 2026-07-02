// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AuthFundCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 授权id
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 授权开始时间，格式为yyyy-MM-dd
    @NameInMap("auth_begin_time")
    public String authBeginTime;

    // 授权结束时间，格式为yyyy-MM-dd
    @NameInMap("auth_end_time")
    public String authEndTime;

    // 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
    @NameInMap("order_query_begin")
    @Validation(required = true)
    public String orderQueryBegin;

    // 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
    @NameInMap("order_query_end")
    public String orderQueryEnd;

    public static AuthFundCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthFundCreditgrantingRequest self = new AuthFundCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public AuthFundCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthFundCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthFundCreditgrantingRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AuthFundCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AuthFundCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public AuthFundCreditgrantingRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public AuthFundCreditgrantingRequest setAuthBeginTime(String authBeginTime) {
        this.authBeginTime = authBeginTime;
        return this;
    }
    public String getAuthBeginTime() {
        return this.authBeginTime;
    }

    public AuthFundCreditgrantingRequest setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public AuthFundCreditgrantingRequest setOrderQueryBegin(String orderQueryBegin) {
        this.orderQueryBegin = orderQueryBegin;
        return this;
    }
    public String getOrderQueryBegin() {
        return this.orderQueryBegin;
    }

    public AuthFundCreditgrantingRequest setOrderQueryEnd(String orderQueryEnd) {
        this.orderQueryEnd = orderQueryEnd;
        return this;
    }
    public String getOrderQueryEnd() {
        return this.orderQueryEnd;
    }

}

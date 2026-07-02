// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundmngcreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商户社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 资方社会统一信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 订单号类型，ORDER_NO(订单id)或PACKAGE_ID(资产包id)
    @NameInMap("order_no_type")
    @Validation(required = true)
    public String orderNoType;

    // 订单id或资产包id
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryInnerFundmngcreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundmngcreditRequest self = new QueryInnerFundmngcreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundmngcreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerFundmngcreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerFundmngcreditRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerFundmngcreditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryInnerFundmngcreditRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public QueryInnerFundmngcreditRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public QueryInnerFundmngcreditRequest setOrderNoType(String orderNoType) {
        this.orderNoType = orderNoType;
        return this;
    }
    public String getOrderNoType() {
        return this.orderNoType;
    }

    public QueryInnerFundmngcreditRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryInnerFundmngcreditRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}

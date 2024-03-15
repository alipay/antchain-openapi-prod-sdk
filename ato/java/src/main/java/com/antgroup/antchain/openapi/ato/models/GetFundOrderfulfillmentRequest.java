// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetFundOrderfulfillmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String orderId;

    // 租赁订单所属商家租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 49, minLength = 1)
    public String merchantTenantId;

    // 期数
    // 如果填入，获取term_idx下的履约记录
    // 如果不填入，获取order_id下的所有履约记录
    @NameInMap("term_idx")
    public Long termIdx;

    public static GetFundOrderfulfillmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundOrderfulfillmentRequest self = new GetFundOrderfulfillmentRequest();
        return TeaModel.build(map, self);
    }

    public GetFundOrderfulfillmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFundOrderfulfillmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetFundOrderfulfillmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetFundOrderfulfillmentRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public GetFundOrderfulfillmentRequest setTermIdx(Long termIdx) {
        this.termIdx = termIdx;
        return this;
    }
    public Long getTermIdx() {
        return this.termIdx;
    }

}

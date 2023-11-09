// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GetAntchainAtoFundOrderfulfillmentRequest extends TeaModel {
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

    public static GetAntchainAtoFundOrderfulfillmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoFundOrderfulfillmentRequest self = new GetAntchainAtoFundOrderfulfillmentRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoFundOrderfulfillmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainAtoFundOrderfulfillmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainAtoFundOrderfulfillmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoFundOrderfulfillmentRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public GetAntchainAtoFundOrderfulfillmentRequest setTermIdx(Long termIdx) {
        this.termIdx = termIdx;
        return this;
    }
    public Long getTermIdx() {
        return this.termIdx;
    }

}

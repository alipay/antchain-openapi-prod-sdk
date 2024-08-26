// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerWithholdplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 64)
    public String merchantTenantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    public static QueryInnerWithholdplanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerWithholdplanRequest self = new QueryInnerWithholdplanRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerWithholdplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerWithholdplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerWithholdplanRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public QueryInnerWithholdplanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

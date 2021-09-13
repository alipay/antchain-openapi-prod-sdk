// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ExistPricePersonalizedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 收费项编码，只有当商品存在多收费项的时候需要传入
    @NameInMap("price_object_code")
    public String priceObjectCode;

    public static ExistPricePersonalizedRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistPricePersonalizedRequest self = new ExistPricePersonalizedRequest();
        return TeaModel.build(map, self);
    }

    public ExistPricePersonalizedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistPricePersonalizedRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExistPricePersonalizedRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ExistPricePersonalizedRequest setPriceObjectCode(String priceObjectCode) {
        this.priceObjectCode = priceObjectCode;
        return this;
    }
    public String getPriceObjectCode() {
        return this.priceObjectCode;
    }

}

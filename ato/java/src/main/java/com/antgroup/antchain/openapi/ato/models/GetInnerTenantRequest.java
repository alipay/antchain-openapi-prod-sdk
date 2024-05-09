// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户在数科的租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String merchantTenantId;

    public static GetInnerTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInnerTenantRequest self = new GetInnerTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetInnerTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInnerTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInnerTenantRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetInnerProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户在数科的租户id
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String merchantTenantId;

    // 商户统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantId;

    // 商品id
    @NameInMap("product_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String productId;

    // 商品版本
    @NameInMap("product_version")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String productVersion;

    public static GetInnerProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInnerProductRequest self = new GetInnerProductRequest();
        return TeaModel.build(map, self);
    }

    public GetInnerProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetInnerProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetInnerProductRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public GetInnerProductRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public GetInnerProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetInnerProductRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

}

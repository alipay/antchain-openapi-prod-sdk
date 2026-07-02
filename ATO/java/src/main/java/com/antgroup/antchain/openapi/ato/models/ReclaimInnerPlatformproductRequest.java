// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ReclaimInnerPlatformproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 平台商品Id
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商户商品spuId
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    public static ReclaimInnerPlatformproductRequest build(java.util.Map<String, ?> map) throws Exception {
        ReclaimInnerPlatformproductRequest self = new ReclaimInnerPlatformproductRequest();
        return TeaModel.build(map, self);
    }

    public ReclaimInnerPlatformproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReclaimInnerPlatformproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReclaimInnerPlatformproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ReclaimInnerPlatformproductRequest setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public ReclaimInnerPlatformproductRequest setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

}

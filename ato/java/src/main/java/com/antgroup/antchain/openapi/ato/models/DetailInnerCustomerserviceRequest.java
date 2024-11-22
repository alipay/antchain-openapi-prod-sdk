// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DetailInnerCustomerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 公司社会统一信息代码，间联模式必传
    @NameInMap("merchant_id")
    public String merchantId;

    // 进件类型 
    // DIRECT("DIRECT", "直连进件模式"),
    // AGENT("AGENT", "代理商进件模式"),
    @NameInMap("expand_mode")
    @Validation(required = true)
    public String expandMode;

    public static DetailInnerCustomerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailInnerCustomerserviceRequest self = new DetailInnerCustomerserviceRequest();
        return TeaModel.build(map, self);
    }

    public DetailInnerCustomerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailInnerCustomerserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailInnerCustomerserviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DetailInnerCustomerserviceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public DetailInnerCustomerserviceRequest setExpandMode(String expandMode) {
        this.expandMode = expandMode;
        return this;
    }
    public String getExpandMode() {
        return this.expandMode;
    }

}

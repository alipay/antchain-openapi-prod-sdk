// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateWithholdOverduetimeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 首款方id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商家名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 商家提供的产品名称
    @NameInMap("merchant_service_name")
    @Validation(required = true)
    public String merchantServiceName;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CreateWithholdOverduetimeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdOverduetimeRequest self = new CreateWithholdOverduetimeRequest();
        return TeaModel.build(map, self);
    }

    public CreateWithholdOverduetimeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateWithholdOverduetimeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateWithholdOverduetimeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateWithholdOverduetimeRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateWithholdOverduetimeRequest setMerchantServiceName(String merchantServiceName) {
        this.merchantServiceName = merchantServiceName;
        return this;
    }
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    public CreateWithholdOverduetimeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

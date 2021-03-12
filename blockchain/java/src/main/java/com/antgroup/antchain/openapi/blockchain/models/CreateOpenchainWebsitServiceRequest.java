// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateOpenchainWebsitServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户code,如法人的唯一id
    @NameInMap("merchant_code")
    @Validation(required = true)
    public String merchantCode;

    // 商户名称
    @NameInMap("merchant_name")
    @Validation(required = true)
    public String merchantName;

    // 租户code
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CreateOpenchainWebsitServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenchainWebsitServiceRequest self = new CreateOpenchainWebsitServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenchainWebsitServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOpenchainWebsitServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOpenchainWebsitServiceRequest setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
        return this;
    }
    public String getMerchantCode() {
        return this.merchantCode;
    }

    public CreateOpenchainWebsitServiceRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateOpenchainWebsitServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

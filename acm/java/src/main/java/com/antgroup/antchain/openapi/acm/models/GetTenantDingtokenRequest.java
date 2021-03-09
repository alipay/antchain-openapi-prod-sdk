// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetTenantDingtokenRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 入驻金融云的产品码
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 租户唯一标识
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static GetTenantDingtokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTenantDingtokenRequest self = new GetTenantDingtokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTenantDingtokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTenantDingtokenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetTenantDingtokenRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}

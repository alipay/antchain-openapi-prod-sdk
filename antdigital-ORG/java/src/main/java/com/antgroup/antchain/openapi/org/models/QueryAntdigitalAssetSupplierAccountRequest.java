// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class QueryAntdigitalAssetSupplierAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryAntdigitalAssetSupplierAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalAssetSupplierAccountRequest self = new QueryAntdigitalAssetSupplierAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalAssetSupplierAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalAssetSupplierAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalAssetSupplierAccountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

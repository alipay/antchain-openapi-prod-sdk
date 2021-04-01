// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantProvisionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 行为
    @NameInMap("business_action")
    @Validation(required = true)
    public String businessAction;

    // 要查询的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static QueryMerchantProvisionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantProvisionsRequest self = new QueryMerchantProvisionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantProvisionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantProvisionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMerchantProvisionsRequest setBusinessAction(String businessAction) {
        this.businessAction = businessAction;
        return this;
    }
    public String getBusinessAction() {
        return this.businessAction;
    }

    public QueryMerchantProvisionsRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public QueryMerchantProvisionsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}

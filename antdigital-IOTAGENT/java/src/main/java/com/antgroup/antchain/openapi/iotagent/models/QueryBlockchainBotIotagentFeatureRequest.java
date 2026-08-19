// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentFeatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户名
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static QueryBlockchainBotIotagentFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentFeatureRequest self = new QueryBlockchainBotIotagentFeatureRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentFeatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotIotagentFeatureRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotIotagentFeatureRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

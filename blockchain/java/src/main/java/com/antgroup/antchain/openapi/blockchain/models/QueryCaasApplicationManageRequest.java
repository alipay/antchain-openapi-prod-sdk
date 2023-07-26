// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCaasApplicationManageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用程序ID
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    public static QueryCaasApplicationManageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCaasApplicationManageRequest self = new QueryCaasApplicationManageRequest();
        return TeaModel.build(map, self);
    }

    public QueryCaasApplicationManageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCaasApplicationManageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCaasApplicationManageRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}

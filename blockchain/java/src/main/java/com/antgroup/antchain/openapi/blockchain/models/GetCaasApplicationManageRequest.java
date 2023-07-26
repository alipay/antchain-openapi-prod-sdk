// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetCaasApplicationManageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用程序ID
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    public static GetCaasApplicationManageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaasApplicationManageRequest self = new GetCaasApplicationManageRequest();
        return TeaModel.build(map, self);
    }

    public GetCaasApplicationManageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCaasApplicationManageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCaasApplicationManageRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}

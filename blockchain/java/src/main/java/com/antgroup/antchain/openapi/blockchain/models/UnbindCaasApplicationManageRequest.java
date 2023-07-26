// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnbindCaasApplicationManageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用程序ID
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    public static UnbindCaasApplicationManageRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindCaasApplicationManageRequest self = new UnbindCaasApplicationManageRequest();
        return TeaModel.build(map, self);
    }

    public UnbindCaasApplicationManageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindCaasApplicationManageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindCaasApplicationManageRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}

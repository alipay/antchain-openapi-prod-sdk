// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ApiAntchainAbcTestCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static ApiAntchainAbcTestCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiAntchainAbcTestCreateRequest self = new ApiAntchainAbcTestCreateRequest();
        return TeaModel.build(map, self);
    }

    public ApiAntchainAbcTestCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApiAntchainAbcTestCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApiAntchainAbcTestCreateRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

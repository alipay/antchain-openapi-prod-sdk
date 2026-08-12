// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class UseAntchainAbcJustTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static UseAntchainAbcJustTestRequest build(java.util.Map<String, ?> map) throws Exception {
        UseAntchainAbcJustTestRequest self = new UseAntchainAbcJustTestRequest();
        return TeaModel.build(map, self);
    }

    public UseAntchainAbcJustTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UseAntchainAbcJustTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7efe8c7cfc5b4e23b792bf4510448a97.models;

import com.aliyun.tea.*;

public class BindAntchainAbcLoadtestQweRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindAntchainAbcLoadtestQweRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAntchainAbcLoadtestQweRequest self = new BindAntchainAbcLoadtestQweRequest();
        return TeaModel.build(map, self);
    }

    public BindAntchainAbcLoadtestQweRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAntchainAbcLoadtestQweRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

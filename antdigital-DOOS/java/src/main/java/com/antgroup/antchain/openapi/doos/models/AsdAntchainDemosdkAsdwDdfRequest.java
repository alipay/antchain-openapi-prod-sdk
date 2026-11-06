// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.doos.models;

import com.aliyun.tea.*;

public class AsdAntchainDemosdkAsdwDdfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static AsdAntchainDemosdkAsdwDdfRequest build(java.util.Map<String, ?> map) throws Exception {
        AsdAntchainDemosdkAsdwDdfRequest self = new AsdAntchainDemosdkAsdwDdfRequest();
        return TeaModel.build(map, self);
    }

    public AsdAntchainDemosdkAsdwDdfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsdAntchainDemosdkAsdwDdfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

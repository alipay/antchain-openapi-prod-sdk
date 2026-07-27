// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class PushRiskplusTdiaiworkshopcloudTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static PushRiskplusTdiaiworkshopcloudTestRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRiskplusTdiaiworkshopcloudTestRequest self = new PushRiskplusTdiaiworkshopcloudTestRequest();
        return TeaModel.build(map, self);
    }

    public PushRiskplusTdiaiworkshopcloudTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRiskplusTdiaiworkshopcloudTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

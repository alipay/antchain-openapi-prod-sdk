// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushTdiaiworkshopcloudTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static PushTdiaiworkshopcloudTestRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTdiaiworkshopcloudTestRequest self = new PushTdiaiworkshopcloudTestRequest();
        return TeaModel.build(map, self);
    }

    public PushTdiaiworkshopcloudTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushTdiaiworkshopcloudTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

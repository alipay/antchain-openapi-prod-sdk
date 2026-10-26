// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.genaidetection.models;

import com.aliyun.tea.*;

public class AsynccheckresultZolozmyRaasGenaidetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static AsynccheckresultZolozmyRaasGenaidetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AsynccheckresultZolozmyRaasGenaidetectionRequest self = new AsynccheckresultZolozmyRaasGenaidetectionRequest();
        return TeaModel.build(map, self);
    }

    public AsynccheckresultZolozmyRaasGenaidetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsynccheckresultZolozmyRaasGenaidetectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

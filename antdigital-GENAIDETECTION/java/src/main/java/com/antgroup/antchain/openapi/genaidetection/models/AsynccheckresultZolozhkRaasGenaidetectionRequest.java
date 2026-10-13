// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.genaidetection.models;

import com.aliyun.tea.*;

public class AsynccheckresultZolozhkRaasGenaidetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static AsynccheckresultZolozhkRaasGenaidetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AsynccheckresultZolozhkRaasGenaidetectionRequest self = new AsynccheckresultZolozhkRaasGenaidetectionRequest();
        return TeaModel.build(map, self);
    }

    public AsynccheckresultZolozhkRaasGenaidetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsynccheckresultZolozhkRaasGenaidetectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

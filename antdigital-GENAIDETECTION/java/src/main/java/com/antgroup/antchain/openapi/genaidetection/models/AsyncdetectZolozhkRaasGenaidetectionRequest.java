// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.genaidetection.models;

import com.aliyun.tea.*;

public class AsyncdetectZolozhkRaasGenaidetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static AsyncdetectZolozhkRaasGenaidetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncdetectZolozhkRaasGenaidetectionRequest self = new AsyncdetectZolozhkRaasGenaidetectionRequest();
        return TeaModel.build(map, self);
    }

    public AsyncdetectZolozhkRaasGenaidetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsyncdetectZolozhkRaasGenaidetectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

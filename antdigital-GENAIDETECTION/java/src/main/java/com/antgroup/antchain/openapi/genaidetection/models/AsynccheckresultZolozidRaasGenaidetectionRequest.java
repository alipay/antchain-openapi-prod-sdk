// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.genaidetection.models;

import com.aliyun.tea.*;

public class AsynccheckresultZolozidRaasGenaidetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static AsynccheckresultZolozidRaasGenaidetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AsynccheckresultZolozidRaasGenaidetectionRequest self = new AsynccheckresultZolozidRaasGenaidetectionRequest();
        return TeaModel.build(map, self);
    }

    public AsynccheckresultZolozidRaasGenaidetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AsynccheckresultZolozidRaasGenaidetectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

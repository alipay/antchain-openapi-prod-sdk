// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.genaidetection.models;

import com.aliyun.tea.*;

public class DetectZolozsgRaasGenaidetectionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static DetectZolozsgRaasGenaidetectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectZolozsgRaasGenaidetectionRequest self = new DetectZolozsgRaasGenaidetectionRequest();
        return TeaModel.build(map, self);
    }

    public DetectZolozsgRaasGenaidetectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetectZolozsgRaasGenaidetectionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

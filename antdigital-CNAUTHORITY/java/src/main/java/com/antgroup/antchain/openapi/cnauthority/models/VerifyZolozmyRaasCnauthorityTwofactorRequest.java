// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cnauthority.models;

import com.aliyun.tea.*;

public class VerifyZolozmyRaasCnauthorityTwofactorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozmyRaasCnauthorityTwofactorRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozmyRaasCnauthorityTwofactorRequest self = new VerifyZolozmyRaasCnauthorityTwofactorRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozmyRaasCnauthorityTwofactorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozmyRaasCnauthorityTwofactorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

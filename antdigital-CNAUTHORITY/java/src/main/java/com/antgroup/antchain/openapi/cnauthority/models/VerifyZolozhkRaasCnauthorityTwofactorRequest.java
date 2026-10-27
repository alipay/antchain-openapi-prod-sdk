// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cnauthority.models;

import com.aliyun.tea.*;

public class VerifyZolozhkRaasCnauthorityTwofactorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozhkRaasCnauthorityTwofactorRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozhkRaasCnauthorityTwofactorRequest self = new VerifyZolozhkRaasCnauthorityTwofactorRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozhkRaasCnauthorityTwofactorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozhkRaasCnauthorityTwofactorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

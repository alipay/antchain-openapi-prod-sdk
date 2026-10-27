// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cnauthority.models;

import com.aliyun.tea.*;

public class VerifyZolozidRaasCnauthorityTwofactorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozidRaasCnauthorityTwofactorRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozidRaasCnauthorityTwofactorRequest self = new VerifyZolozidRaasCnauthorityTwofactorRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozidRaasCnauthorityTwofactorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozidRaasCnauthorityTwofactorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

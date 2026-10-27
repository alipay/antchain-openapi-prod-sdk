// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cnauthority.models;

import com.aliyun.tea.*;

public class VerifyZolozsgRaasCnauthorityTwofactorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static VerifyZolozsgRaasCnauthorityTwofactorRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyZolozsgRaasCnauthorityTwofactorRequest self = new VerifyZolozsgRaasCnauthorityTwofactorRequest();
        return TeaModel.build(map, self);
    }

    public VerifyZolozsgRaasCnauthorityTwofactorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyZolozsgRaasCnauthorityTwofactorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}

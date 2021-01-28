// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class DeployMytfTappRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // tappId
    @NameInMap("tapp_id")
    @Validation(required = true)
    public String tappId;

    public static DeployMytfTappRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployMytfTappRequest self = new DeployMytfTappRequest();
        return TeaModel.build(map, self);
    }

    public DeployMytfTappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployMytfTappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployMytfTappRequest setTappId(String tappId) {
        this.tappId = tappId;
        return this;
    }
    public String getTappId() {
        return this.tappId;
    }

}

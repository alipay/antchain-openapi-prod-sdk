// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class GetOauthTokendetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static GetOauthTokendetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOauthTokendetailRequest self = new GetOauthTokendetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOauthTokendetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOauthTokendetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetOauthTokendetailRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}

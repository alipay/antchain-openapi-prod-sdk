// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryOauthRealnameinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 访问token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static QueryOauthRealnameinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOauthRealnameinfoRequest self = new QueryOauthRealnameinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryOauthRealnameinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOauthRealnameinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOauthRealnameinfoRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}

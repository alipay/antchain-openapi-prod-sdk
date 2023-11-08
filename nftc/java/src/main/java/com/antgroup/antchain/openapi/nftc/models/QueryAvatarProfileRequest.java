// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryAvatarProfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 在antchain.nftc.oauth.token.apply接口内获取到的AccessToken，带过期时间，可唯一确定当前用户
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static QueryAvatarProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarProfileRequest self = new QueryAvatarProfileRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvatarProfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAvatarProfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAvatarProfileRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}

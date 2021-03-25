// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetAliyunUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 阿里云用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static GetAliyunUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunUserRequest self = new GetAliyunUserRequest();
        return TeaModel.build(map, self);
    }

    public GetAliyunUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAliyunUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

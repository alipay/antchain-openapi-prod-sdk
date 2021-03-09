// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class ListAccesskeyRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员或服务账号唯一ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ListAccesskeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccesskeyRequest self = new ListAccesskeyRequest();
        return TeaModel.build(map, self);
    }

    public ListAccesskeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAccesskeyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}

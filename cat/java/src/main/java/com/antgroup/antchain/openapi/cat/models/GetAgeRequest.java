// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cat.models;

import com.aliyun.tea.*;

public class GetAgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 猫猫的id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetAgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgeRequest self = new GetAgeRequest();
        return TeaModel.build(map, self);
    }

    public GetAgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAgeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

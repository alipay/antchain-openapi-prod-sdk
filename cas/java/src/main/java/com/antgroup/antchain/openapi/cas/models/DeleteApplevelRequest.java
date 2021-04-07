// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteApplevelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用等级 id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeleteApplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplevelRequest self = new DeleteApplevelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteApplevelRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

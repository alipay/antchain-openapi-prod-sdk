// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteAppgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeleteAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppgroupRequest self = new DeleteAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppgroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

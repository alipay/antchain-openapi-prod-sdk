// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteAppGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的应用分组名称
    @NameInMap("name")
    public String name;

    public static DeleteAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppGroupRequest self = new DeleteAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

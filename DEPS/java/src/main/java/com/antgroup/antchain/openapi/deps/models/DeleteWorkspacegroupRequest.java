// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteWorkspacegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组名称(唯一标识)。
    @NameInMap("name")
    public String name;

    public static DeleteWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspacegroupRequest self = new DeleteWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteWorkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSingleworkspacegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 环境名称。
    @NameInMap("name")
    public String name;

    public static GetSingleworkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSingleworkspacegroupRequest self = new GetSingleworkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public GetSingleworkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSingleworkspacegroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

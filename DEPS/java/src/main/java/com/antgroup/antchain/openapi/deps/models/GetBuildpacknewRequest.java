// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetBuildpacknewRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    public static GetBuildpacknewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpacknewRequest self = new GetBuildpacknewRequest();
        return TeaModel.build(map, self);
    }

    public GetBuildpacknewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetBuildpacknewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

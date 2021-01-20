// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetMetaDeploymentcellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    public static GetMetaDeploymentcellRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDeploymentcellRequest self = new GetMetaDeploymentcellRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaDeploymentcellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMetaDeploymentcellRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

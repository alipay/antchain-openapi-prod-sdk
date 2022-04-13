// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetWorkspacegroupTopologyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境(WorkspaceGroup)名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static GetWorkspacegroupTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacegroupTopologyRequest self = new GetWorkspacegroupTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspacegroupTopologyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetWorkspacegroupTopologyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWorkspacegroupTopologyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}

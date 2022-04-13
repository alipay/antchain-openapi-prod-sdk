// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QuerySidecaropsAllservicesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用于label到metaservice换取wsgName
    @NameInMap("workspace_group_label")
    @Validation(required = true)
    public String workspaceGroupLabel;

    public static QuerySidecaropsAllservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySidecaropsAllservicesRequest self = new QuerySidecaropsAllservicesRequest();
        return TeaModel.build(map, self);
    }

    public QuerySidecaropsAllservicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySidecaropsAllservicesRequest setWorkspaceGroupLabel(String workspaceGroupLabel) {
        this.workspaceGroupLabel = workspaceGroupLabel;
        return this;
    }
    public String getWorkspaceGroupLabel() {
        return this.workspaceGroupLabel;
    }

}

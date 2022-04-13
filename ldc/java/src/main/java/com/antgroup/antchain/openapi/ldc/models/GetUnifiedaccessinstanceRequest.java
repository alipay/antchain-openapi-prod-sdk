// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetUnifiedaccessinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 统一接入实例名称
    @NameInMap("unified_access_instance_name")
    @Validation(required = true)
    public String unifiedAccessInstanceName;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static GetUnifiedaccessinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnifiedaccessinstanceRequest self = new GetUnifiedaccessinstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetUnifiedaccessinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnifiedaccessinstanceRequest setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public GetUnifiedaccessinstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}

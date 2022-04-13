// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SetFlowDefaultuidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 是否压测，默认 false
    @NameInMap("press")
    public Boolean press;

    public static SetFlowDefaultuidRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFlowDefaultuidRequest self = new SetFlowDefaultuidRequest();
        return TeaModel.build(map, self);
    }

    public SetFlowDefaultuidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetFlowDefaultuidRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public SetFlowDefaultuidRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

}

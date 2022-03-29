// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateLogserviceDesensconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 需配置的脱敏类型
    @NameInMap("desens_types")
    @Validation(required = true)
    public java.util.List<String> desensTypes;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static UpdateLogserviceDesensconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogserviceDesensconfigRequest self = new UpdateLogserviceDesensconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogserviceDesensconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateLogserviceDesensconfigRequest setDesensTypes(java.util.List<String> desensTypes) {
        this.desensTypes = desensTypes;
        return this;
    }
    public java.util.List<String> getDesensTypes() {
        return this.desensTypes;
    }

    public UpdateLogserviceDesensconfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}

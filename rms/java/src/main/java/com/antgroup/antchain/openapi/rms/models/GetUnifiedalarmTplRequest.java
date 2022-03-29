// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetUnifiedalarmTplRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 主键
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 工作空间名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static GetUnifiedalarmTplRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnifiedalarmTplRequest self = new GetUnifiedalarmTplRequest();
        return TeaModel.build(map, self);
    }

    public GetUnifiedalarmTplRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetUnifiedalarmTplRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetUnifiedalarmTplRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}

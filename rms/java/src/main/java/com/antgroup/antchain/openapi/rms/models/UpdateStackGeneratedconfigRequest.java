// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateStackGeneratedconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 待修改的技术栈配置
    @NameInMap("generated_config")
    @Validation(required = true)
    public StackGeneratedConfig generatedConfig;

    public static UpdateStackGeneratedconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGeneratedconfigRequest self = new UpdateStackGeneratedconfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStackGeneratedconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateStackGeneratedconfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateStackGeneratedconfigRequest setGeneratedConfig(StackGeneratedConfig generatedConfig) {
        this.generatedConfig = generatedConfig;
        return this;
    }
    public StackGeneratedConfig getGeneratedConfig() {
        return this.generatedConfig;
    }

}

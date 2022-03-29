// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateCustompluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 自定义监控指标详细信息 (嵌套对象)
    @NameInMap("custom_plugin")
    @Validation(required = true)
    public CustomPluginDO customPlugin;

    public static CreateCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustompluginRequest self = new CreateCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateCustompluginRequest setCustomPlugin(CustomPluginDO customPlugin) {
        this.customPlugin = customPlugin;
        return this;
    }
    public CustomPluginDO getCustomPlugin() {
        return this.customPlugin;
    }

}

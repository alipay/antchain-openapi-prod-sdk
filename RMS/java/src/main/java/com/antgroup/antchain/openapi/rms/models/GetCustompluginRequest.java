// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetCustompluginRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    // 自定义监控指标 ID
    @NameInMap("id")
    public Long id;

    // 类型
    @NameInMap("plugin_type")
    public String pluginType;

    public static GetCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustompluginRequest self = new GetCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public GetCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetCustompluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetCustompluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

}

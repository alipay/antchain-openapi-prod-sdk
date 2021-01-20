// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteCustompluginRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 监控产品类型
    @NameInMap("plugin_type")
    public String pluginType;

    // id
    @NameInMap("id")
    public Long id;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static DeleteCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustompluginRequest self = new DeleteCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCustompluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public DeleteCustompluginRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}

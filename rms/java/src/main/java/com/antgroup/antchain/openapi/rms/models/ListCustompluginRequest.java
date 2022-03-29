// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListCustompluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 插件类型
    @NameInMap("plugin_type")
    public String pluginType;

    // 过滤类型
    @NameInMap("filter_type")
    public String filterType;

    // 过滤条件，如app名称
    @NameInMap("filter")
    public String filter;

    public static ListCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustompluginRequest self = new ListCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public ListCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ListCustompluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public ListCustompluginRequest setFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }
    public String getFilterType() {
        return this.filterType;
    }

    public ListCustompluginRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

}

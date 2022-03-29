// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryFolderPathRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 自定义监控 ID 
    @NameInMap("custom_plugin_id")
    public Long customPluginId;

    // 文件夹 ID
    @NameInMap("folder_id")
    @Validation(required = true)
    public Long folderId;

    // 是否包含插件名
    @NameInMap("include_plugin_name")
    @Validation(required = true)
    public Boolean includePluginName;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static QueryFolderPathRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFolderPathRequest self = new QueryFolderPathRequest();
        return TeaModel.build(map, self);
    }

    public QueryFolderPathRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFolderPathRequest setCustomPluginId(Long customPluginId) {
        this.customPluginId = customPluginId;
        return this;
    }
    public Long getCustomPluginId() {
        return this.customPluginId;
    }

    public QueryFolderPathRequest setFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }
    public Long getFolderId() {
        return this.folderId;
    }

    public QueryFolderPathRequest setIncludePluginName(Boolean includePluginName) {
        this.includePluginName = includePluginName;
        return this;
    }
    public Boolean getIncludePluginName() {
        return this.includePluginName;
    }

    public QueryFolderPathRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}

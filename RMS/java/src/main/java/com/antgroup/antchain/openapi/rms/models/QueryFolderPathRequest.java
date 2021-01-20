// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryFolderPathRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 自定义监控 ID 
    @NameInMap("custom_plugin_id")
    public Long customPluginId;

    // 文件夹 ID
    @NameInMap("folder_id")
    public Long folderId;

    // 是否包含插件名
    @NameInMap("include_plugin_name")
    public Boolean includePluginName;

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

}

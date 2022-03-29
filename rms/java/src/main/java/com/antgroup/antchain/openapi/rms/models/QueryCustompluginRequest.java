// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryCustompluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 父级文件夹 ID
    @NameInMap("parent_folder_id")
    @Validation(required = true)
    public Long parentFolderId;

    // 插件类型
    @NameInMap("plugin_type")
    public String pluginType;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryCustompluginRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustompluginRequest self = new QueryCustompluginRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustompluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustompluginRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryCustompluginRequest setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

    public QueryCustompluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public QueryCustompluginRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCustompluginRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}

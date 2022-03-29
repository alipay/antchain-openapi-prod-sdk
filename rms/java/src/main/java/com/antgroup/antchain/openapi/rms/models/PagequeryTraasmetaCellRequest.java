// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // current_page
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // cell name
    @NameInMap("name")
    public String name;

    // workspace name
    @NameInMap("workspace_name")
    public String workspaceName;

    // workspace uuid
    @NameInMap("workspace_uuid")
    public String workspaceUuid;

    public static PagequeryTraasmetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaCellRequest self = new PagequeryTraasmetaCellRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTraasmetaCellRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaCellRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PagequeryTraasmetaCellRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public PagequeryTraasmetaCellRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

}

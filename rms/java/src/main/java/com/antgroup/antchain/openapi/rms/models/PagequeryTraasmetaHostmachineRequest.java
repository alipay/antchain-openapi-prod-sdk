// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PagequeryTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // page_size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // currentPage
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // workspace_name
    @NameInMap("workspace_name")
    public String workspaceName;

    // workspace_uuid
    @NameInMap("workspace_uuid")
    public String workspaceUuid;

    // hostname
    @NameInMap("hostname")
    public String hostname;

    // ip
    @NameInMap("ip")
    public String ip;

    public static PagequeryTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTraasmetaHostmachineRequest self = new PagequeryTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryTraasmetaHostmachineRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTraasmetaHostmachineRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryTraasmetaHostmachineRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public PagequeryTraasmetaHostmachineRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public PagequeryTraasmetaHostmachineRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public PagequeryTraasmetaHostmachineRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}

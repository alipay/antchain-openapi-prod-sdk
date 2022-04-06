// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerImportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // zone identity
    @NameInMap("zone")
    public String zone;

    // page size
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // current page
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 机器名称
    @NameInMap("name")
    public String name;

    // 是否只查询可导入的
    @NameInMap("importable_only")
    public Boolean importableOnly;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static QueryComputerImportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerImportRequest self = new QueryComputerImportRequest();
        return TeaModel.build(map, self);
    }

    public QueryComputerImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryComputerImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryComputerImportRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public QueryComputerImportRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryComputerImportRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryComputerImportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryComputerImportRequest setImportableOnly(Boolean importableOnly) {
        this.importableOnly = importableOnly;
        return this;
    }
    public Boolean getImportableOnly() {
        return this.importableOnly;
    }

    public QueryComputerImportRequest setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public QueryComputerImportRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

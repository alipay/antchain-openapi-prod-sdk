// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // current page
    @NameInMap("current_page")
    public Long currentPage;

    // page size
    @NameInMap("page_size")
    public Long pageSize;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // type
    @NameInMap("type")
    public String type;

    // computer_ids
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // devices
    @NameInMap("devices")
    public java.util.List<String> devices;

    // max_size
    @NameInMap("max_size")
    public Long maxSize;

    // min_size
    @NameInMap("min_size")
    public Long minSize;

    // workspace_ids
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    // name
    @NameInMap("name")
    public String name;

    public static QueryDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDiskRequest self = new QueryDiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryDiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDiskRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDiskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDiskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryDiskRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryDiskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryDiskRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public QueryDiskRequest setDevices(java.util.List<String> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<String> getDevices() {
        return this.devices;
    }

    public QueryDiskRequest setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Long getMaxSize() {
        return this.maxSize;
    }

    public QueryDiskRequest setMinSize(Long minSize) {
        this.minSize = minSize;
        return this;
    }
    public Long getMinSize() {
        return this.minSize;
    }

    public QueryDiskRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public QueryDiskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

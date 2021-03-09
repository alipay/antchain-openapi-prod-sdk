// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryRequestTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

    // max_time
    @NameInMap("max_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String maxTime;

    // min_time
    @NameInMap("min_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String minTime;

    // operators
    @NameInMap("operators")
    public java.util.List<String> operators;

    // operatorType
    @NameInMap("operator_type")
    public String operatorType;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // requestIds
    @NameInMap("request_ids")
    public java.util.List<String> requestIds;

    // request_statuses
    @NameInMap("request_statuses")
    public java.util.List<String> requestStatuses;

    // request_types
    @NameInMap("request_types")
    public java.util.List<String> requestTypes;

    // resource_ids
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    // resource_types
    @NameInMap("resource_types")
    public java.util.List<String> resourceTypes;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // workspace_ids
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    public static QueryRequestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestTaskRequest self = new QueryRequestTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryRequestTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRequestTaskRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRequestTaskRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryRequestTaskRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public QueryRequestTaskRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public QueryRequestTaskRequest setOperators(java.util.List<String> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<String> getOperators() {
        return this.operators;
    }

    public QueryRequestTaskRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public QueryRequestTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRequestTaskRequest setRequestIds(java.util.List<String> requestIds) {
        this.requestIds = requestIds;
        return this;
    }
    public java.util.List<String> getRequestIds() {
        return this.requestIds;
    }

    public QueryRequestTaskRequest setRequestStatuses(java.util.List<String> requestStatuses) {
        this.requestStatuses = requestStatuses;
        return this;
    }
    public java.util.List<String> getRequestStatuses() {
        return this.requestStatuses;
    }

    public QueryRequestTaskRequest setRequestTypes(java.util.List<String> requestTypes) {
        this.requestTypes = requestTypes;
        return this;
    }
    public java.util.List<String> getRequestTypes() {
        return this.requestTypes;
    }

    public QueryRequestTaskRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public QueryRequestTaskRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public QueryRequestTaskRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryRequestTaskRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}

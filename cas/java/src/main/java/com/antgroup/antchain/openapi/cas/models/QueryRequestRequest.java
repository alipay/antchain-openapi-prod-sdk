// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryRequestRequest extends TeaModel {
    // OAuth模式下的授权token
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
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String maxTime;

    // min_time
    @NameInMap("min_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String minTime;

    // operators
    @NameInMap("operators")
    public java.util.List<String> operators;

    // operator_type
    @NameInMap("operator_type")
    public String operatorType;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // parent_ids
    @NameInMap("parent_ids")
    public java.util.List<String> parentIds;

    // resource_ids
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    // resource_types
    @NameInMap("resource_types")
    public java.util.List<String> resourceTypes;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // task_statuses
    @NameInMap("task_statuses")
    public java.util.List<String> taskStatuses;

    // tokens
    @NameInMap("tokens")
    public java.util.List<String> tokens;

    // types
    @NameInMap("types")
    public java.util.List<String> types;

    // workspace_ids
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    public static QueryRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRequestRequest self = new QueryRequestRequest();
        return TeaModel.build(map, self);
    }

    public QueryRequestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRequestRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryRequestRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryRequestRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public QueryRequestRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public QueryRequestRequest setOperators(java.util.List<String> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<String> getOperators() {
        return this.operators;
    }

    public QueryRequestRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public QueryRequestRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRequestRequest setParentIds(java.util.List<String> parentIds) {
        this.parentIds = parentIds;
        return this;
    }
    public java.util.List<String> getParentIds() {
        return this.parentIds;
    }

    public QueryRequestRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public QueryRequestRequest setResourceTypes(java.util.List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<String> getResourceTypes() {
        return this.resourceTypes;
    }

    public QueryRequestRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryRequestRequest setTaskStatuses(java.util.List<String> taskStatuses) {
        this.taskStatuses = taskStatuses;
        return this;
    }
    public java.util.List<String> getTaskStatuses() {
        return this.taskStatuses;
    }

    public QueryRequestRequest setTokens(java.util.List<String> tokens) {
        this.tokens = tokens;
        return this;
    }
    public java.util.List<String> getTokens() {
        return this.tokens;
    }

    public QueryRequestRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryRequestRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}

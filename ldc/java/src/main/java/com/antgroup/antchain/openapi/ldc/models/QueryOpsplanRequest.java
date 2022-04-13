// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryOpsplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    // 
    @NameInMap("app_name")
    public String appName;

    // 发布单创建起始时间
    // 
    @NameInMap("creation_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTimeFrom;

    // 发布单创建截止时间
    // 
    @NameInMap("creation_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTimeTo;

    // 当前页码，从1开始
    @NameInMap("current_page")
    @Validation(required = true)
    public Long currentPage;

    // 发布单名称前缀
    @NameInMap("name")
    public String name;

    // 运维单类型：REBOOT,ONLINE,OFFLINE
    @NameInMap("mode")
    public String mode;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long pageSize;

    // 发布单id列表
    // 
    @NameInMap("plan_ids")
    public java.util.List<String> planIds;

    // 发布单状态列表
    @NameInMap("state_list")
    public java.util.List<String> stateList;

    // 发布单号
    // 
    @NameInMap("time_series_id")
    public String timeSeriesId;

    // 发布单类型列表， e.g: 分组发布|重启
    // 
    @NameInMap("types")
    @Validation(required = true)
    public java.util.List<String> types;

    // 工作空间组名称
    // 
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static QueryOpsplanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsplanRequest self = new QueryOpsplanRequest();
        return TeaModel.build(map, self);
    }

    public QueryOpsplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOpsplanRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryOpsplanRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryOpsplanRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

    public QueryOpsplanRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryOpsplanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryOpsplanRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryOpsplanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOpsplanRequest setPlanIds(java.util.List<String> planIds) {
        this.planIds = planIds;
        return this;
    }
    public java.util.List<String> getPlanIds() {
        return this.planIds;
    }

    public QueryOpsplanRequest setStateList(java.util.List<String> stateList) {
        this.stateList = stateList;
        return this;
    }
    public java.util.List<String> getStateList() {
        return this.stateList;
    }

    public QueryOpsplanRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public QueryOpsplanRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryOpsplanRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}

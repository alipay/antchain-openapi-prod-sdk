// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryRiskTasksRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 当前页数
    @NameInMap("page")
    @Validation(required = true)
    public Long page;

    // 页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 风险ID
    @NameInMap("risk_task_id")
    public String riskTaskId;

    // 风险名称
    @NameInMap("display_name")
    public String displayName;

    // 风险等级
    @NameInMap("priority")
    public String priority;

    // 风险类型
    @NameInMap("risk_type")
    public String riskType;

    // 风险状态
    @NameInMap("risk_task_state")
    public String riskTaskState;

    // FROM时间点， 按照时间范围搜索的开始时间点
    @NameInMap("creation_time_from")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTimeFrom;

    // to时间点， 按照时间范围搜索的结束时间点	
    // 
    @NameInMap("creation_time_to")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTimeTo;

    public static QueryRiskTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskTasksRequest self = new QueryRiskTasksRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskTasksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskTasksRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public QueryRiskTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRiskTasksRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

    public QueryRiskTasksRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public QueryRiskTasksRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public QueryRiskTasksRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public QueryRiskTasksRequest setRiskTaskState(String riskTaskState) {
        this.riskTaskState = riskTaskState;
        return this;
    }
    public String getRiskTaskState() {
        return this.riskTaskState;
    }

    public QueryRiskTasksRequest setCreationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }
    public String getCreationTimeFrom() {
        return this.creationTimeFrom;
    }

    public QueryRiskTasksRequest setCreationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }
    public String getCreationTimeTo() {
        return this.creationTimeTo;
    }

}

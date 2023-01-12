// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ApplyPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 发布单time_series_id
    @NameInMap("time_series_id")
    @Validation(required = true)
    public String timeSeriesId;

    // 审批人账号id
    @NameInMap("assignee_ids")
    public java.util.List<String> assigneeIds;

    public static ApplyPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPlanRequest self = new ApplyPlanRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPlanRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ApplyPlanRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public ApplyPlanRequest setAssigneeIds(java.util.List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }
    public java.util.List<String> getAssigneeIds() {
        return this.assigneeIds;
    }

}

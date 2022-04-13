// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ApplyContainerserviceDeploymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单time_series_id
    @NameInMap("time_series_id")
    @Validation(required = true)
    public String timeSeriesId;

    // 审批人账号id
    @NameInMap("assignee_ids")
    public java.util.List<String> assigneeIds;

    public static ApplyContainerserviceDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyContainerserviceDeploymentRequest self = new ApplyContainerserviceDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ApplyContainerserviceDeploymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyContainerserviceDeploymentRequest setTimeSeriesId(String timeSeriesId) {
        this.timeSeriesId = timeSeriesId;
        return this;
    }
    public String getTimeSeriesId() {
        return this.timeSeriesId;
    }

    public ApplyContainerserviceDeploymentRequest setAssigneeIds(java.util.List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }
    public java.util.List<String> getAssigneeIds() {
        return this.assigneeIds;
    }

}

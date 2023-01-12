// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RetryBgreleaseTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 概览ID
    @NameInMap("arrangement_id")
    @Validation(required = true)
    public String arrangementId;

    // 发布单ID
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // retry_info
    @NameInMap("retry_info")
    @Validation(required = true)
    public RetryInfo retryInfo;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static RetryBgreleaseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryBgreleaseTaskRequest self = new RetryBgreleaseTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryBgreleaseTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RetryBgreleaseTaskRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RetryBgreleaseTaskRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public RetryBgreleaseTaskRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RetryBgreleaseTaskRequest setRetryInfo(RetryInfo retryInfo) {
        this.retryInfo = retryInfo;
        return this;
    }
    public RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public RetryBgreleaseTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RetryBgreleaseTaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}

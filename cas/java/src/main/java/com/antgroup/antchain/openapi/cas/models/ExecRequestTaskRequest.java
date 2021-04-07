// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ExecRequestTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // rmc_request_id，注意区分OPENAPI自身的request_id
    @NameInMap("rmc_request_id")
    @Validation(required = true)
    public String rmcRequestId;

    // task_ids
    @NameInMap("task_ids")
    @Validation(required = true)
    public java.util.List<String> taskIds;

    public static ExecRequestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecRequestTaskRequest self = new ExecRequestTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecRequestTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecRequestTaskRequest setRmcRequestId(String rmcRequestId) {
        this.rmcRequestId = rmcRequestId;
        return this;
    }
    public String getRmcRequestId() {
        return this.rmcRequestId;
    }

    public ExecRequestTaskRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}

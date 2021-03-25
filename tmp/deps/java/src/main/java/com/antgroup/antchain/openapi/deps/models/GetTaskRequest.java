// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetTaskRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 请求的业务号，当`task_id`参数指定时该参数会被忽略
    @NameInMap("req_biz_id")
    public String reqBizId;

    // 异步请求的id， 当`req_biz_id`参数指定时可以不指定该参数，如果指定了该参数则忽略`req_biz_id`参数
    @NameInMap("task_id")
    public String taskId;

    public static GetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRequest self = new GetTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTaskRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetTaskRequest setReqBizId(String reqBizId) {
        this.reqBizId = reqBizId;
        return this;
    }
    public String getReqBizId() {
        return this.reqBizId;
    }

    public GetTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

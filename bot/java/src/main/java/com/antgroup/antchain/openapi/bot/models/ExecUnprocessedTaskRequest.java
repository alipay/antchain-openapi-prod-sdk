// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecUnprocessedTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 任务名称枚举
    // confirm_device_state : 确认设备状态变更
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 任务参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    public static ExecUnprocessedTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecUnprocessedTaskRequest self = new ExecUnprocessedTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecUnprocessedTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecUnprocessedTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecUnprocessedTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ExecUnprocessedTaskRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ExecUnprocessedTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}

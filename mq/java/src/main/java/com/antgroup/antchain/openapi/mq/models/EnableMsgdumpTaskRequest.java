// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class EnableMsgdumpTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务 id
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    // true: 启动任务
    // false: 停止任务
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    public static EnableMsgdumpTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMsgdumpTaskRequest self = new EnableMsgdumpTaskRequest();
        return TeaModel.build(map, self);
    }

    public EnableMsgdumpTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableMsgdumpTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableMsgdumpTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public EnableMsgdumpTaskRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}

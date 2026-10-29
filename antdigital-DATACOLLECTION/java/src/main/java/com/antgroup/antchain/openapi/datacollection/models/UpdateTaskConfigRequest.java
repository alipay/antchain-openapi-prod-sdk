// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.datacollection.models;

import com.aliyun.tea.*;

public class UpdateTaskConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 采集任务主键id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 水位存储key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 水位值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UpdateTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskConfigRequest self = new UpdateTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTaskConfigRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateTaskConfigRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateTaskConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

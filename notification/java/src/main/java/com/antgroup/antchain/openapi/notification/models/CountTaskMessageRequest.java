// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class CountTaskMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 24位任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static CountTaskMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CountTaskMessageRequest self = new CountTaskMessageRequest();
        return TeaModel.build(map, self);
    }

    public CountTaskMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountTaskMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

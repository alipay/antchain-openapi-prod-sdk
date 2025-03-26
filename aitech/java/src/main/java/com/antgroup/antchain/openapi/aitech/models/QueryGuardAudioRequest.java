// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryGuardAudioRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryGuardAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardAudioRequest self = new QueryGuardAudioRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardAudioRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

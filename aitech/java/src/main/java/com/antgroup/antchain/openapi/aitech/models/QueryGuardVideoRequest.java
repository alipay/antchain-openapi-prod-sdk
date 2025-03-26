// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QueryGuardVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryGuardVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGuardVideoRequest self = new QueryGuardVideoRequest();
        return TeaModel.build(map, self);
    }

    public QueryGuardVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGuardVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGuardVideoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

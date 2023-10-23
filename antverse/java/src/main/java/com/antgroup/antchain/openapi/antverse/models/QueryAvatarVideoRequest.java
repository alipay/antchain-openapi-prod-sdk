// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class QueryAvatarVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 视频任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryAvatarVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarVideoRequest self = new QueryAvatarVideoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvatarVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAvatarVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAvatarVideoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

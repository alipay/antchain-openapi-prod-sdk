// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NotifyAuthTaskStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 支uid
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // NO_START, NO_SUBMIT, NOT_COMPLETE, COMPLETE
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 状态发生时间
    @NameInMap("happen_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String happenTime;

    public static NotifyAuthTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyAuthTaskStatusRequest self = new NotifyAuthTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public NotifyAuthTaskStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyAuthTaskStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyAuthTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public NotifyAuthTaskStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotifyAuthTaskStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public NotifyAuthTaskStatusRequest setHappenTime(String happenTime) {
        this.happenTime = happenTime;
        return this;
    }
    public String getHappenTime() {
        return this.happenTime;
    }

}

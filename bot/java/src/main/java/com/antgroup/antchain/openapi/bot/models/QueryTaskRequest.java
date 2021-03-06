// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务Id
    // 
    // 
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 场景码 
    // 
    // 
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static QueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskRequest self = new QueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}

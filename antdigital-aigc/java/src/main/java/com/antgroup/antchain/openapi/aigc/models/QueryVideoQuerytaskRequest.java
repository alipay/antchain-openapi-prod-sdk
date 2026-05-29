// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class QueryVideoQuerytaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询的任务ID
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryVideoQuerytaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoQuerytaskRequest self = new QueryVideoQuerytaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryVideoQuerytaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVideoQuerytaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryVideoQuerytaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

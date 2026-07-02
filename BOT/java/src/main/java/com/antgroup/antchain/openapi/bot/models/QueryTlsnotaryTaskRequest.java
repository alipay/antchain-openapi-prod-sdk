// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTlsnotaryTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 唯一的业务 tlsnotary 任务 id
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    public static QueryTlsnotaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTlsnotaryTaskRequest self = new QueryTlsnotaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryTlsnotaryTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTlsnotaryTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTlsnotaryTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

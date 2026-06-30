// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktDataaccessStatisticRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询回执统计的任务id
    @NameInMap("task_id")
    @Validation(required = true)
    public Long taskId;

    public static QueryUmktDataaccessStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktDataaccessStatisticRequest self = new QueryUmktDataaccessStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryUmktDataaccessStatisticRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUmktDataaccessStatisticRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUmktDataaccessStatisticRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trdemo.models;

import com.aliyun.tea.*;

public class QueryLoadtestmarkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试字段
    @NameInMap("time_limit")
    @Validation(required = true)
    public String timeLimit;

    public static QueryLoadtestmarkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadtestmarkRequest self = new QueryLoadtestmarkRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadtestmarkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadtestmarkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLoadtestmarkRequest setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }
    public String getTimeLimit() {
        return this.timeLimit;
    }

}

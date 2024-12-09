// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryLoadtestTimeFourRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 毫秒值
    @NameInMap("timeout")
    @Validation(required = true)
    public Long timeout;

    public static QueryLoadtestTimeFourRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadtestTimeFourRequest self = new QueryLoadtestTimeFourRequest();
        return TeaModel.build(map, self);
    }

    public QueryLoadtestTimeFourRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLoadtestTimeFourRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLoadtestTimeFourRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}

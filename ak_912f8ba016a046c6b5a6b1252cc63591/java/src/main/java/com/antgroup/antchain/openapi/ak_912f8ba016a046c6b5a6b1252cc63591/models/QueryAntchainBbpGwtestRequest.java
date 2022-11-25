// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_912f8ba016a046c6b5a6b1252cc63591.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpGwtestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间 毫秒
    @NameInMap("timeout")
    public Long timeout;

    public static QueryAntchainBbpGwtestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpGwtestRequest self = new QueryAntchainBbpGwtestRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpGwtestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainBbpGwtestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainBbpGwtestRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryAntchainAbcTimeFiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 下游超时时间
    @NameInMap("timeout")
    public String timeout;

    public static QueryAntchainAbcTimeFiveRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAbcTimeFiveRequest self = new QueryAntchainAbcTimeFiveRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAbcTimeFiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAbcTimeFiveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAbcTimeFiveRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_50c620ebd72240219637191db5c3441d.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayEmbedRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例参数
    @NameInMap("timeout")
    public String timeout;

    public static QueryDemoGatewayEmbedRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayEmbedRequest self = new QueryDemoGatewayEmbedRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayEmbedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoGatewayEmbedRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoGatewayEmbedRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

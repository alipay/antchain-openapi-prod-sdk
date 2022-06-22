// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGatewayCheckEchotimeoutRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 10
    @NameInMap("timeout")
    public String timeout;

    public static QueryGatewayCheckEchotimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayCheckEchotimeoutRequest self = new QueryGatewayCheckEchotimeoutRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayCheckEchotimeoutRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayCheckEchotimeoutRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayCheckEchotimeoutRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

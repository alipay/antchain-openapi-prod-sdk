// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7efe8c7cfc5b4e23b792bf4510448a97.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayCheckEchotimeoutRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 10
    @NameInMap("timeout")
    public String timeout;

    public static QueryDemoGatewayCheckEchotimeoutRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayCheckEchotimeoutRequest self = new QueryDemoGatewayCheckEchotimeoutRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayCheckEchotimeoutRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoGatewayCheckEchotimeoutRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoGatewayCheckEchotimeoutRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

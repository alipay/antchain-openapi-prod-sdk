// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGatewayCheckEchotimeoutokRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 耗时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static QueryGatewayCheckEchotimeoutokRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayCheckEchotimeoutokRequest self = new QueryGatewayCheckEchotimeoutokRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayCheckEchotimeoutokRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayCheckEchotimeoutokRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayCheckEchotimeoutokRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}

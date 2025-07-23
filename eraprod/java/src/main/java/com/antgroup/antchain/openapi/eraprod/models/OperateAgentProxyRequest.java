// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class OperateAgentProxyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json 序列化后的请求入参
    @NameInMap("request_json")
    @Validation(required = true)
    public String requestJson;

    public static OperateAgentProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAgentProxyRequest self = new OperateAgentProxyRequest();
        return TeaModel.build(map, self);
    }

    public OperateAgentProxyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateAgentProxyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateAgentProxyRequest setRequestJson(String requestJson) {
        this.requestJson = requestJson;
        return this;
    }
    public String getRequestJson() {
        return this.requestJson;
    }

}

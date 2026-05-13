// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class DispatchAgentSaasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // map 结构
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static DispatchAgentSaasRequest build(java.util.Map<String, ?> map) throws Exception {
        DispatchAgentSaasRequest self = new DispatchAgentSaasRequest();
        return TeaModel.build(map, self);
    }

    public DispatchAgentSaasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DispatchAgentSaasRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DispatchAgentSaasRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}

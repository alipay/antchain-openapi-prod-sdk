// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ServiceGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ServiceGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ServiceGatewayCheckRequest self = new ServiceGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public ServiceGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}

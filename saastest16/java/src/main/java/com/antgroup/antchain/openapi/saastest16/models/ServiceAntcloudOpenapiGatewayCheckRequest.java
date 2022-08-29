// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saastest16.models;

import com.aliyun.tea.*;

public class ServiceAntcloudOpenapiGatewayCheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ServiceAntcloudOpenapiGatewayCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ServiceAntcloudOpenapiGatewayCheckRequest self = new ServiceAntcloudOpenapiGatewayCheckRequest();
        return TeaModel.build(map, self);
    }

    public ServiceAntcloudOpenapiGatewayCheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}

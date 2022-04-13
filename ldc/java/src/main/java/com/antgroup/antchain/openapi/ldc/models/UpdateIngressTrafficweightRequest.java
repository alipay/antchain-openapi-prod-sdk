// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateIngressTrafficweightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 流量权重列表
    @NameInMap("service_weights")
    @Validation(required = true)
    public java.util.List<ServiceWeight> serviceWeights;

    // service id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static UpdateIngressTrafficweightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressTrafficweightRequest self = new UpdateIngressTrafficweightRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIngressTrafficweightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIngressTrafficweightRequest setServiceWeights(java.util.List<ServiceWeight> serviceWeights) {
        this.serviceWeights = serviceWeights;
        return this;
    }
    public java.util.List<ServiceWeight> getServiceWeights() {
        return this.serviceWeights;
    }

    public UpdateIngressTrafficweightRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}

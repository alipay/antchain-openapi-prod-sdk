// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryReleasepipelineEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单对应的service id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static QueryReleasepipelineEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReleasepipelineEventRequest self = new QueryReleasepipelineEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryReleasepipelineEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryReleasepipelineEventRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}

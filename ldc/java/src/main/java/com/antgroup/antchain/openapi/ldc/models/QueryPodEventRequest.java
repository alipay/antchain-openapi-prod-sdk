// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryPodEventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 发布单对应的service_id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // POD对应的u_id
    @NameInMap("u_id")
    @Validation(required = true)
    public String uId;

    public static QueryPodEventRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPodEventRequest self = new QueryPodEventRequest();
        return TeaModel.build(map, self);
    }

    public QueryPodEventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPodEventRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryPodEventRequest setUId(String uId) {
        this.uId = uId;
        return this;
    }
    public String getUId() {
        return this.uId;
    }

}

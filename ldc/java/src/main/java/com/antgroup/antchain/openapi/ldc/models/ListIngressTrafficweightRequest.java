// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListIngressTrafficweightRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // lks_service_id，antcloud.ldc.opsplan.detail.query 接口返回的 group_collection_list. app_group_list.id，和查询应用服务发布单详情的id一样
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static ListIngressTrafficweightRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIngressTrafficweightRequest self = new ListIngressTrafficweightRequest();
        return TeaModel.build(map, self);
    }

    public ListIngressTrafficweightRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIngressTrafficweightRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}

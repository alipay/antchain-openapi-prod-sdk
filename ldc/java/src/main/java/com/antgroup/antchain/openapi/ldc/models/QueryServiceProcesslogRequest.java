// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryServiceProcesslogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 观测对象类型，RPV2，RP_STAGE，POD
    @NameInMap("object_kind")
    @Validation(required = true)
    public String objectKind;

    // 观测对象名称
    @NameInMap("object_name")
    @Validation(required = true)
    public String objectName;

    // 发布单对应的service_id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 发布单id
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    public static QueryServiceProcesslogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceProcesslogRequest self = new QueryServiceProcesslogRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceProcesslogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceProcesslogRequest setObjectKind(String objectKind) {
        this.objectKind = objectKind;
        return this;
    }
    public String getObjectKind() {
        return this.objectKind;
    }

    public QueryServiceProcesslogRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public QueryServiceProcesslogRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryServiceProcesslogRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}

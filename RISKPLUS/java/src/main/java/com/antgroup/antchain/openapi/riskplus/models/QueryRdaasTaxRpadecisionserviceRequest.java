// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRdaasTaxRpadecisionserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 决策服务
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 决策租户
    @NameInMap("decision_tenant")
    @Validation(required = true)
    public String decisionTenant;

    public static QueryRdaasTaxRpadecisionserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRdaasTaxRpadecisionserviceRequest self = new QueryRdaasTaxRpadecisionserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRdaasTaxRpadecisionserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRdaasTaxRpadecisionserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRdaasTaxRpadecisionserviceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public QueryRdaasTaxRpadecisionserviceRequest setDecisionTenant(String decisionTenant) {
        this.decisionTenant = decisionTenant;
        return this;
    }
    public String getDecisionTenant() {
        return this.decisionTenant;
    }

}

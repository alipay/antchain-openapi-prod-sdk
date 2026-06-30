// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRdaasTaxRpadecisionindicatorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 决策服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 决策属性名称，目前一种属性: 比重-weight
    @NameInMap("property_name")
    public String propertyName;

    // 决策租户
    @NameInMap("decision_tenant")
    public String decisionTenant;

    public static QueryRdaasTaxRpadecisionindicatorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRdaasTaxRpadecisionindicatorRequest self = new QueryRdaasTaxRpadecisionindicatorRequest();
        return TeaModel.build(map, self);
    }

    public QueryRdaasTaxRpadecisionindicatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRdaasTaxRpadecisionindicatorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRdaasTaxRpadecisionindicatorRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryRdaasTaxRpadecisionindicatorRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public QueryRdaasTaxRpadecisionindicatorRequest setDecisionTenant(String decisionTenant) {
        this.decisionTenant = decisionTenant;
        return this;
    }
    public String getDecisionTenant() {
        return this.decisionTenant;
    }

}

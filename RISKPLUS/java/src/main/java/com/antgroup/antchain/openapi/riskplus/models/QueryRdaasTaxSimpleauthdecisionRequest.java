// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRdaasTaxSimpleauthdecisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 决策租户
    @NameInMap("decision_tenant")
    @Validation(required = true)
    public String decisionTenant;

    // 授权类型
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // 省份
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    public static QueryRdaasTaxSimpleauthdecisionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRdaasTaxSimpleauthdecisionRequest self = new QueryRdaasTaxSimpleauthdecisionRequest();
        return TeaModel.build(map, self);
    }

    public QueryRdaasTaxSimpleauthdecisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRdaasTaxSimpleauthdecisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRdaasTaxSimpleauthdecisionRequest setDecisionTenant(String decisionTenant) {
        this.decisionTenant = decisionTenant;
        return this;
    }
    public String getDecisionTenant() {
        return this.decisionTenant;
    }

    public QueryRdaasTaxSimpleauthdecisionRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public QueryRdaasTaxSimpleauthdecisionRequest setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

}

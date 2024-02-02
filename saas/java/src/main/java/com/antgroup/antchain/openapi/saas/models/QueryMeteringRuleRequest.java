// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMeteringRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 技术产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 商业产品码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    public static QueryMeteringRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeteringRuleRequest self = new QueryMeteringRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeteringRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeteringRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeteringRuleRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryMeteringRuleRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

}

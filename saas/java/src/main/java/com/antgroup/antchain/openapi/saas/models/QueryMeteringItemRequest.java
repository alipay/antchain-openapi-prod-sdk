// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryMeteringItemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商业产品码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 计量域
    @NameInMap("metering_domain_code")
    @Validation(required = true)
    public String meteringDomainCode;

    public static QueryMeteringItemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeteringItemRequest self = new QueryMeteringItemRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeteringItemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMeteringItemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMeteringItemRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryMeteringItemRequest setMeteringDomainCode(String meteringDomainCode) {
        this.meteringDomainCode = meteringDomainCode;
        return this;
    }
    public String getMeteringDomainCode() {
        return this.meteringDomainCode;
    }

}

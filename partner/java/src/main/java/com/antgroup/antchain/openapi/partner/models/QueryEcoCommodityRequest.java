// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryEcoCommodityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户name
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 商品信息列表
    @NameInMap("offer_codes")
    @Validation(required = true)
    public java.util.List<String> offerCodes;

    public static QueryEcoCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEcoCommodityRequest self = new QueryEcoCommodityRequest();
        return TeaModel.build(map, self);
    }

    public QueryEcoCommodityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEcoCommodityRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryEcoCommodityRequest setOfferCodes(java.util.List<String> offerCodes) {
        this.offerCodes = offerCodes;
        return this;
    }
    public java.util.List<String> getOfferCodes() {
        return this.offerCodes;
    }

}

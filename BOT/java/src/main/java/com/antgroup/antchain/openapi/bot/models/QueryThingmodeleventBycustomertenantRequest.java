// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingmodeleventBycustomertenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户的租户ID
    @NameInMap("customer_tenant")
    @Validation(required = true)
    public String customerTenant;

    public static QueryThingmodeleventBycustomertenantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryThingmodeleventBycustomertenantRequest self = new QueryThingmodeleventBycustomertenantRequest();
        return TeaModel.build(map, self);
    }

    public QueryThingmodeleventBycustomertenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryThingmodeleventBycustomertenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryThingmodeleventBycustomertenantRequest setCustomerTenant(String customerTenant) {
        this.customerTenant = customerTenant;
        return this;
    }
    public String getCustomerTenant() {
        return this.customerTenant;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 企业ID
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    public static GetCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerRequest self = new GetCustomerRequest();
        return TeaModel.build(map, self);
    }

    public GetCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCustomerRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

}

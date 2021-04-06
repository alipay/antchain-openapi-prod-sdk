// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class ListCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static ListCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomerRequest self = new ListCustomerRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}

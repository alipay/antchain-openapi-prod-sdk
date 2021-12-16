// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBillingcoreInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreInvoiceRequest self = new QueryBillingcoreInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}

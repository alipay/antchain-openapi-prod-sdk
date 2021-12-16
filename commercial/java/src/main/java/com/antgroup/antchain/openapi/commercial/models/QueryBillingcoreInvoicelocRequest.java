// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreInvoicelocRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBillingcoreInvoicelocRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreInvoicelocRequest self = new QueryBillingcoreInvoicelocRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreInvoicelocRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}

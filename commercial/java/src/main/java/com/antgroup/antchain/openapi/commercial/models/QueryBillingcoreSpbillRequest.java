// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreSpbillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 账单id
    @NameInMap("bill_id")
    @Validation(required = true)
    public String billId;

    public static QueryBillingcoreSpbillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreSpbillRequest self = new QueryBillingcoreSpbillRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreSpbillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBillingcoreSpbillRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

}

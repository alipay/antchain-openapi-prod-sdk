// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryBillingcoreMerchantinvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static QueryBillingcoreMerchantinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBillingcoreMerchantinvoiceRequest self = new QueryBillingcoreMerchantinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBillingcoreMerchantinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBillingcoreMerchantinvoiceRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}

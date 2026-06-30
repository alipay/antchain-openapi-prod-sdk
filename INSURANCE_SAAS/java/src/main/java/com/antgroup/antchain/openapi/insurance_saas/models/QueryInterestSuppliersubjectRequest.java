// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class QueryInterestSuppliersubjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 权益流水号
    @NameInMap("interest_no")
    @Validation(required = true)
    public String interestNo;

    public static QueryInterestSuppliersubjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInterestSuppliersubjectRequest self = new QueryInterestSuppliersubjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryInterestSuppliersubjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInterestSuppliersubjectRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryInterestSuppliersubjectRequest setInterestNo(String interestNo) {
        this.interestNo = interestNo;
        return this;
    }
    public String getInterestNo() {
        return this.interestNo;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseInstallmentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约id
    @NameInMap("application_id")
    public String applicationId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 归还的第几期
    @NameInMap("term")
    @Validation(required = true)
    public String term;

    // 商家租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    public static QueryLeaseInstallmentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseInstallmentRequest self = new QueryLeaseInstallmentRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseInstallmentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseInstallmentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseInstallmentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseInstallmentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseInstallmentRequest setTerm(String term) {
        this.term = term;
        return this;
    }
    public String getTerm() {
        return this.term;
    }

    public QueryLeaseInstallmentRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

}

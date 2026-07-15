// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseOrderclearingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 期数
    @NameInMap("term")
    @Validation(required = true)
    public Long term;

    // 融资租赁合约id
    @NameInMap("application_id")
    public String applicationId;

    // 清分单号
    @NameInMap("clearing_order_id")
    @Validation(required = true)
    public String clearingOrderId;

    // 租赁机构id
    @NameInMap("lease_id")
    public String leaseId;

    public static QueryLeaseOrderclearingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseOrderclearingRequest self = new QueryLeaseOrderclearingRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseOrderclearingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseOrderclearingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseOrderclearingRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseOrderclearingRequest setTerm(Long term) {
        this.term = term;
        return this;
    }
    public Long getTerm() {
        return this.term;
    }

    public QueryLeaseOrderclearingRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseOrderclearingRequest setClearingOrderId(String clearingOrderId) {
        this.clearingOrderId = clearingOrderId;
        return this;
    }
    public String getClearingOrderId() {
        return this.clearingOrderId;
    }

    public QueryLeaseOrderclearingRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

}

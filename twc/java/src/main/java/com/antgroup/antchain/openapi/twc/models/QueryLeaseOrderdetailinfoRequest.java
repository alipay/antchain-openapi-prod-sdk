// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseOrderdetailinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 融资租赁租赁机构id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 融资租赁合约id
    @NameInMap("application_id")
    public String applicationId;

    public static QueryLeaseOrderdetailinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseOrderdetailinfoRequest self = new QueryLeaseOrderdetailinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseOrderdetailinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseOrderdetailinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseOrderdetailinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseOrderdetailinfoRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseOrderdetailinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseUserperformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 本次融资的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 首租订单号
    @NameInMap("first_order_id")
    @Validation(required = true)
    public String firstOrderId;

    // 本次融资双方的合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 商家的租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 首次融资的合约id
    @NameInMap("first_application_id")
    public String firstApplicationId;

    public static QueryLeaseUserperformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseUserperformanceRequest self = new QueryLeaseUserperformanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseUserperformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseUserperformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseUserperformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseUserperformanceRequest setFirstOrderId(String firstOrderId) {
        this.firstOrderId = firstOrderId;
        return this;
    }
    public String getFirstOrderId() {
        return this.firstOrderId;
    }

    public QueryLeaseUserperformanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseUserperformanceRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseUserperformanceRequest setFirstApplicationId(String firstApplicationId) {
        this.firstApplicationId = firstApplicationId;
        return this;
    }
    public String getFirstApplicationId() {
        return this.firstApplicationId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 租赁机构金融科技租户id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 融资租赁合约id
    @NameInMap("application_id")
    public String applicationId;

    // 融资租赁清分期数
    @NameInMap("term")
    @Validation(required = true)
    public Long term;

    public static QueryLeaseFinancecreditRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecreditRequest self = new QueryLeaseFinancecreditRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseFinancecreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseFinancecreditRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseFinancecreditRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseFinancecreditRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseFinancecreditRequest setTerm(Long term) {
        this.term = term;
        return this;
    }
    public Long getTerm() {
        return this.term;
    }

}

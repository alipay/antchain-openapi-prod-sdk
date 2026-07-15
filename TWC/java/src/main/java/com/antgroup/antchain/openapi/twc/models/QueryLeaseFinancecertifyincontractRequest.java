// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecertifyincontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约id
    @NameInMap("application_id")
    @Validation(required = true)
    public String applicationId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 核验id
    @NameInMap("lease_certify_id")
    @Validation(required = true)
    public String leaseCertifyId;

    public static QueryLeaseFinancecertifyincontractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecertifyincontractRequest self = new QueryLeaseFinancecertifyincontractRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecertifyincontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseFinancecertifyincontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseFinancecertifyincontractRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseFinancecertifyincontractRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseFinancecertifyincontractRequest setLeaseCertifyId(String leaseCertifyId) {
        this.leaseCertifyId = leaseCertifyId;
        return this;
    }
    public String getLeaseCertifyId() {
        return this.leaseCertifyId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecertifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 租赁商户金融科技租户id
    @NameInMap("lease_id")
    public String leaseId;

    // 核验凭证
    @NameInMap("lease_certify_id")
    @Validation(required = true)
    public String leaseCertifyId;

    public static QueryLeaseFinancecertifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecertifyRequest self = new QueryLeaseFinancecertifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecertifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseFinancecertifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseFinancecertifyRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseFinancecertifyRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseFinancecertifyRequest setLeaseCertifyId(String leaseCertifyId) {
        this.leaseCertifyId = leaseCertifyId;
        return this;
    }
    public String getLeaseCertifyId() {
        return this.leaseCertifyId;
    }

}

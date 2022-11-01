// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseAsyncencryptedinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台创建返回
    @NameInMap("application_id")
    public String applicationId;

    // 被查询的租赁公司对应的租户ID
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 	
    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryLeaseAsyncencryptedinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseAsyncencryptedinfoRequest self = new QueryLeaseAsyncencryptedinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseAsyncencryptedinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseAsyncencryptedinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseAsyncencryptedinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public QueryLeaseAsyncencryptedinfoRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public QueryLeaseAsyncencryptedinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class QueryDepositCharityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务幂等id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 合约服务实例id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static QueryDepositCharityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDepositCharityRequest self = new QueryDepositCharityRequest();
        return TeaModel.build(map, self);
    }

    public QueryDepositCharityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDepositCharityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDepositCharityRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDepositCharityRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}

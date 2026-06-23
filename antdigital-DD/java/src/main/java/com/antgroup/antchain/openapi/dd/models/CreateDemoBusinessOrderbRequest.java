// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateDemoBusinessOrderbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CreateDemoBusinessOrderbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoBusinessOrderbRequest self = new CreateDemoBusinessOrderbRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoBusinessOrderbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDemoBusinessOrderbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDemoBusinessOrderbRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public CreateDemoBusinessOrderbRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

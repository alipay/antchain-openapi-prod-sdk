// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cliproduct.models;

import com.aliyun.tea.*;

public class CreateBusinessOrdervRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单名称
    @NameInMap("order_name")
    @Validation(required = true)
    public String orderName;

    // 订单金额
    @NameInMap("order_amount")
    public Long orderAmount;

    // 订单名称
    @NameInMap("order_namez")
    @Validation(required = true)
    public String orderNamez;

    public static CreateBusinessOrdervRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessOrdervRequest self = new CreateBusinessOrdervRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessOrdervRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBusinessOrdervRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBusinessOrdervRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateBusinessOrdervRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public CreateBusinessOrdervRequest setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public Long getOrderAmount() {
        return this.orderAmount;
    }

    public CreateBusinessOrdervRequest setOrderNamez(String orderNamez) {
        this.orderNamez = orderNamez;
        return this;
    }
    public String getOrderNamez() {
        return this.orderNamez;
    }

}

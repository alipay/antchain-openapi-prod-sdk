// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateDemoBusinessOrderzRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 订单结构体
    @NameInMap("order_info")
    @Validation(required = true)
    public OrderInfo orderInfo;

    public static CreateDemoBusinessOrderzRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoBusinessOrderzRequest self = new CreateDemoBusinessOrderzRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoBusinessOrderzRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDemoBusinessOrderzRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDemoBusinessOrderzRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDemoBusinessOrderzRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public CreateDemoBusinessOrderzRequest setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

}

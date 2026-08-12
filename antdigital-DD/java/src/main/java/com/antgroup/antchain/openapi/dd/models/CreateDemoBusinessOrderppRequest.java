// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class CreateDemoBusinessOrderppRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单编号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static CreateDemoBusinessOrderppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemoBusinessOrderppRequest self = new CreateDemoBusinessOrderppRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemoBusinessOrderppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDemoBusinessOrderppRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDemoBusinessOrderppRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyBclFinancingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id,长度不超过32位
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static ApplyBclFinancingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyBclFinancingRequest self = new ApplyBclFinancingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyBclFinancingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyBclFinancingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyBclFinancingRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

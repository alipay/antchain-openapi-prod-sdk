// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelIotbasicAppreleaseorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 工单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CancelIotbasicAppreleaseorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelIotbasicAppreleaseorderRequest self = new CancelIotbasicAppreleaseorderRequest();
        return TeaModel.build(map, self);
    }

    public CancelIotbasicAppreleaseorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelIotbasicAppreleaseorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelIotbasicAppreleaseorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

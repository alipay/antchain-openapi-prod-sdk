// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CancelIotlinkAppreleaseorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 工单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static CancelIotlinkAppreleaseorderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelIotlinkAppreleaseorderRequest self = new CancelIotlinkAppreleaseorderRequest();
        return TeaModel.build(map, self);
    }

    public CancelIotlinkAppreleaseorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelIotlinkAppreleaseorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelIotlinkAppreleaseorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

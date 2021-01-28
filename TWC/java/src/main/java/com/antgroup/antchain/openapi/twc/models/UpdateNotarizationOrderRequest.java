// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateNotarizationOrderRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 如果出证失败，需要给出失败原因
    @NameInMap("reason")
    public String reason;

    // 出证状态的枚举值
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdateNotarizationOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNotarizationOrderRequest self = new UpdateNotarizationOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNotarizationOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateNotarizationOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateNotarizationOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateNotarizationOrderRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UpdateNotarizationOrderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CancelWithholdPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 当发现跨天继续提交
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 取消原因
    // RENTING_OUT:退租
    // RENTING_AND_RESALE:租转售
    // 
    // 
    @NameInMap("cancel_reason")
    @Validation(required = true, maxLength = 64)
    public String cancelReason;

    public static CancelWithholdPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelWithholdPlanRequest self = new CancelWithholdPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelWithholdPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelWithholdPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelWithholdPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelWithholdPlanRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

}

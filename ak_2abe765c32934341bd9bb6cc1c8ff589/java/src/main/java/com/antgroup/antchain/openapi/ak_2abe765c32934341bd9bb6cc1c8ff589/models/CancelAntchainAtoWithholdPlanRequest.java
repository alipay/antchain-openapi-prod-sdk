// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class CancelAntchainAtoWithholdPlanRequest extends TeaModel {
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

    public static CancelAntchainAtoWithholdPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAntchainAtoWithholdPlanRequest self = new CancelAntchainAtoWithholdPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelAntchainAtoWithholdPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAntchainAtoWithholdPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAntchainAtoWithholdPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelAntchainAtoWithholdPlanRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

}

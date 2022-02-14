// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PushPrivatecontractGaugeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云合同服务实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 计量数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 本次上报的唯一订单幂等ID，用流程ID和文件ID拼接生成
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static PushPrivatecontractGaugeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushPrivatecontractGaugeRequest self = new PushPrivatecontractGaugeRequest();
        return TeaModel.build(map, self);
    }

    public PushPrivatecontractGaugeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushPrivatecontractGaugeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushPrivatecontractGaugeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushPrivatecontractGaugeRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public PushPrivatecontractGaugeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

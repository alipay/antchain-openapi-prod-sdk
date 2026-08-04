// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部订单号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    @Validation(required = true)
    public String refundRequestNo;

    // 退款退分账金额，单位：分
    // 限制条件：大于0，小于等于订单金额
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 退款退分账原因
    @NameInMap("refund_reason")
    public String refundReason;

    public static PushOrderRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        PushOrderRefundRequest self = new PushOrderRefundRequest();
        return TeaModel.build(map, self);
    }

    public PushOrderRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushOrderRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushOrderRefundRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public PushOrderRefundRequest setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public PushOrderRefundRequest setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public PushOrderRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

}

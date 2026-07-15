// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendWithholdRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝支付单据号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 外部订单号,请求方保证唯一性
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 退款备注
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static SendWithholdRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        SendWithholdRefundRequest self = new SendWithholdRefundRequest();
        return TeaModel.build(map, self);
    }

    public SendWithholdRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendWithholdRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendWithholdRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SendWithholdRefundRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public SendWithholdRefundRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public SendWithholdRefundRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class PaymentShareConfirmResult extends TeaModel {
    // 蚂蚁分账申请返回的交易号
    @NameInMap("org_order_id")
    @Validation(required = true)
    public String orgOrderId;

    // 蚂蚁分账确认订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 外部请求ID，幂等字段
    @NameInMap("out_request_id")
    @Validation(required = true)
    public String outRequestId;

    // 分账单状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 业务错误码(为空表示成功，否则为业务错误码)
    @NameInMap("sub_code")
    @Validation(required = true)
    public String subCode;

    // 业务错误描述
    @NameInMap("sub_msg")
    @Validation(required = true)
    public String subMsg;

    public static PaymentShareConfirmResult build(java.util.Map<String, ?> map) throws Exception {
        PaymentShareConfirmResult self = new PaymentShareConfirmResult();
        return TeaModel.build(map, self);
    }

    public PaymentShareConfirmResult setOrgOrderId(String orgOrderId) {
        this.orgOrderId = orgOrderId;
        return this;
    }
    public String getOrgOrderId() {
        return this.orgOrderId;
    }

    public PaymentShareConfirmResult setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PaymentShareConfirmResult setOutRequestId(String outRequestId) {
        this.outRequestId = outRequestId;
        return this;
    }
    public String getOutRequestId() {
        return this.outRequestId;
    }

    public PaymentShareConfirmResult setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public PaymentShareConfirmResult setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public PaymentShareConfirmResult setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}

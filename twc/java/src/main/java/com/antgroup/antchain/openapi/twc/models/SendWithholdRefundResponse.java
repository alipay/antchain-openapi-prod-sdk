// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SendWithholdRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    @NameInMap("refund_amount")
    public String refundAmount;

    // 退款成功的日期
    @NameInMap("refund_date")
    public String refundDate;

    // 退款的支付宝系统内部单据id
    @NameInMap("refund_order_id")
    public String refundOrderId;

    // FINISHED,退款成功的状态值
    @NameInMap("status")
    public String status;

    public static SendWithholdRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        SendWithholdRefundResponse self = new SendWithholdRefundResponse();
        return TeaModel.build(map, self);
    }

    public SendWithholdRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SendWithholdRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SendWithholdRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SendWithholdRefundResponse setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public SendWithholdRefundResponse setRefundDate(String refundDate) {
        this.refundDate = refundDate;
        return this;
    }
    public String getRefundDate() {
        return this.refundDate;
    }

    public SendWithholdRefundResponse setRefundOrderId(String refundOrderId) {
        this.refundOrderId = refundOrderId;
        return this;
    }
    public String getRefundOrderId() {
        return this.refundOrderId;
    }

    public SendWithholdRefundResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

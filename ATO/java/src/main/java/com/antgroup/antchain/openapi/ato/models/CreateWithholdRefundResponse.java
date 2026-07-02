// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateWithholdRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    public String refundRequestNo;

    // ACCEPT : 受理成功
    @NameInMap("status")
    public String status;

    // 请求支付宝的退款单据号
    @NameInMap("refund_order_no")
    public String refundOrderNo;

    public static CreateWithholdRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWithholdRefundResponse self = new CreateWithholdRefundResponse();
        return TeaModel.build(map, self);
    }

    public CreateWithholdRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWithholdRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWithholdRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWithholdRefundResponse setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public CreateWithholdRefundResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateWithholdRefundResponse setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
        return this;
    }
    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

}

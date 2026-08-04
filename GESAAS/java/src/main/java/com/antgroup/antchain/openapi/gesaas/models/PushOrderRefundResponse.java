// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class PushOrderRefundResponse extends TeaModel {
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

    // 退款退分账请求状态， ACCEPT : 受理成功
    @NameInMap("refund_status")
    public String refundStatus;

    // 本次退款退分账唯一标识
    @NameInMap("refund_record_no")
    public String refundRecordNo;

    public static PushOrderRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        PushOrderRefundResponse self = new PushOrderRefundResponse();
        return TeaModel.build(map, self);
    }

    public PushOrderRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushOrderRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushOrderRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushOrderRefundResponse setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public PushOrderRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public PushOrderRefundResponse setRefundRecordNo(String refundRecordNo) {
        this.refundRecordNo = refundRecordNo;
        return this;
    }
    public String getRefundRecordNo() {
        return this.refundRecordNo;
    }

}

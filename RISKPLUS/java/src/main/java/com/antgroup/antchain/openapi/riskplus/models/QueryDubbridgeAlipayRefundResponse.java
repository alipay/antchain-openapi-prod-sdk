// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退款状态 REFUNDING（交易退款中）、 REFUND_SUCCESS（交易退款成功）、 REFUND_FAIL（交易退款失败）
    @NameInMap("refund_status")
    public String refundStatus;

    // 退款失败原因
    @NameInMap("refund_fail_reason")
    public String refundFailReason;

    // 退款时间
    @NameInMap("refund_date")
    public String refundDate;

    public static QueryDubbridgeAlipayRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayRefundResponse self = new QueryDubbridgeAlipayRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAlipayRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAlipayRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAlipayRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryDubbridgeAlipayRefundResponse setRefundFailReason(String refundFailReason) {
        this.refundFailReason = refundFailReason;
        return this;
    }
    public String getRefundFailReason() {
        return this.refundFailReason;
    }

    public QueryDubbridgeAlipayRefundResponse setRefundDate(String refundDate) {
        this.refundDate = refundDate;
        return this;
    }
    public String getRefundDate() {
        return this.refundDate;
    }

}

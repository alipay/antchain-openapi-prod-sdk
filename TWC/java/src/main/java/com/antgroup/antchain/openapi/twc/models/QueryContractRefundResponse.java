// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 退款id
    @NameInMap("refund_id")
    public String refundId;

    // 退款时间（时间戳，单位：ms）
    @NameInMap("refund_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String refundTime;

    // 本次退款请求的退款金额（单位：分）
    @NameInMap("refund_amount")
    public Long refundAmount;

    // 退款状态
    // REFUNDING 退款中
    // SUCCESS 退款成功
    // FAIL 退款失败
    @NameInMap("status")
    public String status;

    // 退款错误信息
    @NameInMap("err_msg")
    public String errMsg;

    public static QueryContractRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractRefundResponse self = new QueryContractRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractRefundResponse setRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    public String getRefundId() {
        return this.refundId;
    }

    public QueryContractRefundResponse setRefundTime(String refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public String getRefundTime() {
        return this.refundTime;
    }

    public QueryContractRefundResponse setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public QueryContractRefundResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContractRefundResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}

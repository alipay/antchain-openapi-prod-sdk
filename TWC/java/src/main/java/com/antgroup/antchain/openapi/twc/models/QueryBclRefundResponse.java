// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclRefundResponse extends TeaModel {
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

    // 退款成功的时间, 退款成功返回
    @NameInMap("refund_time")
    public String refundTime;

    // 退款金额, 单位分
    @NameInMap("refund_amount")
    public Long refundAmount;

    // ● 退款中，REFUNDING（需要调用查询接口查询结果)；
    // ● 退款成功REFUND_SUCCESS
    // ● 退款失败REFUND_FAIL
    @NameInMap("refund_status")
    public String refundStatus;

    // 退款失败原因, 退款失败时返回
    @NameInMap("err_msg")
    public String errMsg;

    public static QueryBclRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclRefundResponse self = new QueryBclRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclRefundResponse setRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    public String getRefundId() {
        return this.refundId;
    }

    public QueryBclRefundResponse setRefundTime(String refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public String getRefundTime() {
        return this.refundTime;
    }

    public QueryBclRefundResponse setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public QueryBclRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryBclRefundResponse setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}

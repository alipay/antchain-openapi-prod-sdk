// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功退款金额,整数，单位:分
    @NameInMap("refund_amt")
    public String refundAmt;

    public static QueryCutpaymentRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentRefundResponse self = new QueryCutpaymentRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentRefundResponse setRefundAmt(String refundAmt) {
        this.refundAmt = refundAmt;
        return this;
    }
    public String getRefundAmt() {
        return this.refundAmt;
    }

}

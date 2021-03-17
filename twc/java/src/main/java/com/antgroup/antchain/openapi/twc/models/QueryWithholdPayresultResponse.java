// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryWithholdPayresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 支付完成日期
    @NameInMap("pay_date")
    public String payDate;

    // 支付宝支付单据号
    @NameInMap("pay_order_id")
    public String payOrderId;

    // INIT：受理成功，扣款中
    // FINISHED：扣款成功
    // CLOSED：商户已关单
    @NameInMap("status")
    public String status;

    // 扣款金额
    @NameInMap("trans_amount")
    public String transAmount;

    public static QueryWithholdPayresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdPayresultResponse self = new QueryWithholdPayresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdPayresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdPayresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdPayresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdPayresultResponse setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

    public QueryWithholdPayresultResponse setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
        return this;
    }
    public String getPayOrderId() {
        return this.payOrderId;
    }

    public QueryWithholdPayresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWithholdPayresultResponse setTransAmount(String transAmount) {
        this.transAmount = transAmount;
        return this;
    }
    public String getTransAmount() {
        return this.transAmount;
    }

}

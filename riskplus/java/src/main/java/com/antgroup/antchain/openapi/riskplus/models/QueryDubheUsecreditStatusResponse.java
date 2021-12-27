// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheUsecreditStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用信状态（0-通过/1-不通过2-处理中）
    @NameInMap("status")
    public String status;

    // 拒绝原因
    @NameInMap("msg")
    public String msg;

    // 借据信息
    @NameInMap("receipt_info")
    public ReceiptInfo receiptInfo;

    // 还款计划列表
    @NameInMap("repay_ref")
    public java.util.List<RepayRef> repayRef;

    public static QueryDubheUsecreditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheUsecreditStatusResponse self = new QueryDubheUsecreditStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubheUsecreditStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubheUsecreditStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubheUsecreditStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubheUsecreditStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubheUsecreditStatusResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubheUsecreditStatusResponse setReceiptInfo(ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
        return this;
    }
    public ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    public QueryDubheUsecreditStatusResponse setRepayRef(java.util.List<RepayRef> repayRef) {
        this.repayRef = repayRef;
        return this;
    }
    public java.util.List<RepayRef> getRepayRef() {
        return this.repayRef;
    }

}

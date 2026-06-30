// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeUsecreditStatusResponse extends TeaModel {
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

    // 用信合同编号
    @NameInMap("disburse_contract_no")
    public String disburseContractNo;

    // 授信合同编号
    @NameInMap("credit_contract_no")
    public String creditContractNo;

    public static QueryDubbridgeUsecreditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeUsecreditStatusResponse self = new QueryDubbridgeUsecreditStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeUsecreditStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeUsecreditStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeUsecreditStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeUsecreditStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeUsecreditStatusResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeUsecreditStatusResponse setReceiptInfo(ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
        return this;
    }
    public ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    public QueryDubbridgeUsecreditStatusResponse setRepayRef(java.util.List<RepayRef> repayRef) {
        this.repayRef = repayRef;
        return this;
    }
    public java.util.List<RepayRef> getRepayRef() {
        return this.repayRef;
    }

    public QueryDubbridgeUsecreditStatusResponse setDisburseContractNo(String disburseContractNo) {
        this.disburseContractNo = disburseContractNo;
        return this;
    }
    public String getDisburseContractNo() {
        return this.disburseContractNo;
    }

    public QueryDubbridgeUsecreditStatusResponse setCreditContractNo(String creditContractNo) {
        this.creditContractNo = creditContractNo;
        return this;
    }
    public String getCreditContractNo() {
        return this.creditContractNo;
    }

}

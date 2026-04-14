// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepayResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款编号
    @NameInMap("repay_no")
    public String repayNo;

    // 借据编号
    @NameInMap("receipt_no")
    public String receiptNo;

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 还款类型
    // 1: 全部结清，
    // 2：正常还款
    // 3：当期结清
    // 4：逾期还款
    // 
    @NameInMap("repay_type")
    public String repayType;

    // 还款标志
    // 1 线下还款 
    // 2 用户主动还款
    // 3 系统代扣
    // 
    @NameInMap("repay_sign")
    public String repaySign;

    // 还款账户
    @NameInMap("repay_account")
    public String repayAccount;

    // 还款状态
    @NameInMap("repay_status")
    public String repayStatus;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    // 还款信息列表
    @NameInMap("repay_infos")
    public RepayInfos repayInfos;

    public static QueryDubbridgeRepayResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepayResultResponse self = new QueryDubbridgeRepayResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepayResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepayResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepayResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepayResultResponse setRepayNo(String repayNo) {
        this.repayNo = repayNo;
        return this;
    }
    public String getRepayNo() {
        return this.repayNo;
    }

    public QueryDubbridgeRepayResultResponse setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public QueryDubbridgeRepayResultResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeRepayResultResponse setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public QueryDubbridgeRepayResultResponse setRepaySign(String repaySign) {
        this.repaySign = repaySign;
        return this;
    }
    public String getRepaySign() {
        return this.repaySign;
    }

    public QueryDubbridgeRepayResultResponse setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
        return this;
    }
    public String getRepayAccount() {
        return this.repayAccount;
    }

    public QueryDubbridgeRepayResultResponse setRepayStatus(String repayStatus) {
        this.repayStatus = repayStatus;
        return this;
    }
    public String getRepayStatus() {
        return this.repayStatus;
    }

    public QueryDubbridgeRepayResultResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryDubbridgeRepayResultResponse setRepayInfos(RepayInfos repayInfos) {
        this.repayInfos = repayInfos;
        return this;
    }
    public RepayInfos getRepayInfos() {
        return this.repayInfos;
    }

}

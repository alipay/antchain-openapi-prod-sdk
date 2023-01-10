// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CountDubbridgeRepayReftrialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款计划试算结果
    @NameInMap("repay_trail_list")
    public java.util.List<RepayTrail> repayTrailList;

    // 还款日
    @NameInMap("repay_date")
    public String repayDate;

    // 还款账户
    @NameInMap("repay_account")
    public String repayAccount;

    // 总利息
    @NameInMap("total_interest")
    public Long totalInterest;

    // 授信信息
    @NameInMap("apply_info")
    public ApplyInfo applyInfo;

    public static CountDubbridgeRepayReftrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDubbridgeRepayReftrialResponse self = new CountDubbridgeRepayReftrialResponse();
        return TeaModel.build(map, self);
    }

    public CountDubbridgeRepayReftrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountDubbridgeRepayReftrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountDubbridgeRepayReftrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountDubbridgeRepayReftrialResponse setRepayTrailList(java.util.List<RepayTrail> repayTrailList) {
        this.repayTrailList = repayTrailList;
        return this;
    }
    public java.util.List<RepayTrail> getRepayTrailList() {
        return this.repayTrailList;
    }

    public CountDubbridgeRepayReftrialResponse setRepayDate(String repayDate) {
        this.repayDate = repayDate;
        return this;
    }
    public String getRepayDate() {
        return this.repayDate;
    }

    public CountDubbridgeRepayReftrialResponse setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
        return this;
    }
    public String getRepayAccount() {
        return this.repayAccount;
    }

    public CountDubbridgeRepayReftrialResponse setTotalInterest(Long totalInterest) {
        this.totalInterest = totalInterest;
        return this;
    }
    public Long getTotalInterest() {
        return this.totalInterest;
    }

    public CountDubbridgeRepayReftrialResponse setApplyInfo(ApplyInfo applyInfo) {
        this.applyInfo = applyInfo;
        return this;
    }
    public ApplyInfo getApplyInfo() {
        return this.applyInfo;
    }

}

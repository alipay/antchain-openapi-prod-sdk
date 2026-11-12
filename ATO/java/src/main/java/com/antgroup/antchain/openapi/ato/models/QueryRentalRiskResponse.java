// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原始评分（0-100）
    @NameInMap("risk_score")
    public String riskScore;

    // 风控结果 PASS / REJECT
    @NameInMap("risk_result")
    public String riskResult;

    // 免押额度（分），按商家策略计算
    @NameInMap("free_deposit_amount")
    public Long freeDepositAmount;

    // 拒绝原因，REJECT 时返回
    @NameInMap("reject_reason")
    public String rejectReason;

    // 风控区间
    @NameInMap("risk_rank")
    public Long riskRank;

    public static QueryRentalRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalRiskResponse self = new QueryRentalRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRentalRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRentalRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRentalRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRentalRiskResponse setRiskScore(String riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public String getRiskScore() {
        return this.riskScore;
    }

    public QueryRentalRiskResponse setRiskResult(String riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public String getRiskResult() {
        return this.riskResult;
    }

    public QueryRentalRiskResponse setFreeDepositAmount(Long freeDepositAmount) {
        this.freeDepositAmount = freeDepositAmount;
        return this;
    }
    public Long getFreeDepositAmount() {
        return this.freeDepositAmount;
    }

    public QueryRentalRiskResponse setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }
    public String getRejectReason() {
        return this.rejectReason;
    }

    public QueryRentalRiskResponse setRiskRank(Long riskRank) {
        this.riskRank = riskRank;
        return this;
    }
    public Long getRiskRank() {
        return this.riskRank;
    }

}

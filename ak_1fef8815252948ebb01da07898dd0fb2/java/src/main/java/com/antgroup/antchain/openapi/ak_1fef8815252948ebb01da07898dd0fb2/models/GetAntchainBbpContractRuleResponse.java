// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1fef8815252948ebb01da07898dd0fb2.models;

import com.aliyun.tea.*;

public class GetAntchainBbpContractRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务商
    @NameInMap("sp_provider")
    public SpProvider spProvider;

    // 规则明细
    @NameInMap("rule_details")
    public java.util.List<RuleDetail> ruleDetails;

    // 确认人
    @NameInMap("confirmer")
    public String confirmer;

    // 确认状态
    @NameInMap("confirm_status")
    public String confirmStatus;

    // 确认时间
    @NameInMap("confirm_date")
    public String confirmDate;

    public static GetAntchainBbpContractRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainBbpContractRuleResponse self = new GetAntchainBbpContractRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetAntchainBbpContractRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntchainBbpContractRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntchainBbpContractRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntchainBbpContractRuleResponse setSpProvider(SpProvider spProvider) {
        this.spProvider = spProvider;
        return this;
    }
    public SpProvider getSpProvider() {
        return this.spProvider;
    }

    public GetAntchainBbpContractRuleResponse setRuleDetails(java.util.List<RuleDetail> ruleDetails) {
        this.ruleDetails = ruleDetails;
        return this;
    }
    public java.util.List<RuleDetail> getRuleDetails() {
        return this.ruleDetails;
    }

    public GetAntchainBbpContractRuleResponse setConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }
    public String getConfirmer() {
        return this.confirmer;
    }

    public GetAntchainBbpContractRuleResponse setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

    public GetAntchainBbpContractRuleResponse setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
        return this;
    }
    public String getConfirmDate() {
        return this.confirmDate;
    }

}

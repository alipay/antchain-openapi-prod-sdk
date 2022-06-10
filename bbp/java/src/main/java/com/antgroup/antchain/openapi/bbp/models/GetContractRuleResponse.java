// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class GetContractRuleResponse extends TeaModel {
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

    public static GetContractRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContractRuleResponse self = new GetContractRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetContractRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetContractRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetContractRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetContractRuleResponse setSpProvider(SpProvider spProvider) {
        this.spProvider = spProvider;
        return this;
    }
    public SpProvider getSpProvider() {
        return this.spProvider;
    }

    public GetContractRuleResponse setRuleDetails(java.util.List<RuleDetail> ruleDetails) {
        this.ruleDetails = ruleDetails;
        return this;
    }
    public java.util.List<RuleDetail> getRuleDetails() {
        return this.ruleDetails;
    }

    public GetContractRuleResponse setConfirmer(String confirmer) {
        this.confirmer = confirmer;
        return this;
    }
    public String getConfirmer() {
        return this.confirmer;
    }

    public GetContractRuleResponse setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
    public String getConfirmStatus() {
        return this.confirmStatus;
    }

    public GetContractRuleResponse setConfirmDate(String confirmDate) {
        this.confirmDate = confirmDate;
        return this;
    }
    public String getConfirmDate() {
        return this.confirmDate;
    }

}

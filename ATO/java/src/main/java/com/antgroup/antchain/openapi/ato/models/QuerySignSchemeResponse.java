// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySignSchemeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约单状态
    @NameInMap("status")
    public String status;

    // 签约场景： RENTAL（短租）
    @NameInMap("scene")
    public String scene;

    // 预授权冻结进度；方案不含预授权返回 status=NOT_NEEDED
    @NameInMap("preauth_result")
    public SignCapabilityResult preauthResult;

    // 代扣签约进度；方案不含代扣返回 status=NOT\_NEEDED。组合方案的代扣与预授权一并发起，二者各自独立收敛
    @NameInMap("withhold_result")
    public SignCapabilityResult withholdResult;

    // 合同签署进度；方案不含合同返回 status=NOT\_NEEDED
    @NameInMap("contract_result")
    public SignCapabilityResult contractResult;

    // 代扣协议号；方案不含代扣时为空
    @NameInMap("agreement_no")
    public String agreementNo;

    // 合同签署单号；方案不含合同时为空
    @NameInMap("contract_sign_no")
    public String contractSignNo;

    // 押金方案
    @NameInMap("deposit_type")
    public String depositType;

    // 商品押金（分）
    @NameInMap("deposit_amount")
    public Long depositAmount;

    // 信用减免金额（分）
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 预授权申请冻结额（分），建单/改方案落库的申请额，不参与成功判定
    @NameInMap("preauth_amount")
    public Long preauthAmount;

    // 预授权实际冻结额（分），签约完成判定的资金依据；方案不含预授权或尚未冻结时为空
    @NameInMap("preauth_frozen_amount")
    public Long preauthFrozenAmount;

    // 签约后超期时长（分钟），建单/改方案落库值，签约完成时随订单域 signed 透传
    @NameInMap("signed_overdue_minutes")
    public Long signedOverdueMinutes;

    // 仍有效、已保存的拉起参数列表，结构与发起签约返回的 actions 相同；无可用拉起参数时为空列表
    @NameInMap("actions")
    public java.util.List<SignActionInfo> actions;

    public static QuerySignSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySignSchemeResponse self = new QuerySignSchemeResponse();
        return TeaModel.build(map, self);
    }

    public QuerySignSchemeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySignSchemeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySignSchemeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySignSchemeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySignSchemeResponse setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QuerySignSchemeResponse setPreauthResult(SignCapabilityResult preauthResult) {
        this.preauthResult = preauthResult;
        return this;
    }
    public SignCapabilityResult getPreauthResult() {
        return this.preauthResult;
    }

    public QuerySignSchemeResponse setWithholdResult(SignCapabilityResult withholdResult) {
        this.withholdResult = withholdResult;
        return this;
    }
    public SignCapabilityResult getWithholdResult() {
        return this.withholdResult;
    }

    public QuerySignSchemeResponse setContractResult(SignCapabilityResult contractResult) {
        this.contractResult = contractResult;
        return this;
    }
    public SignCapabilityResult getContractResult() {
        return this.contractResult;
    }

    public QuerySignSchemeResponse setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public QuerySignSchemeResponse setContractSignNo(String contractSignNo) {
        this.contractSignNo = contractSignNo;
        return this;
    }
    public String getContractSignNo() {
        return this.contractSignNo;
    }

    public QuerySignSchemeResponse setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public QuerySignSchemeResponse setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public Long getDepositAmount() {
        return this.depositAmount;
    }

    public QuerySignSchemeResponse setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public QuerySignSchemeResponse setPreauthAmount(Long preauthAmount) {
        this.preauthAmount = preauthAmount;
        return this;
    }
    public Long getPreauthAmount() {
        return this.preauthAmount;
    }

    public QuerySignSchemeResponse setPreauthFrozenAmount(Long preauthFrozenAmount) {
        this.preauthFrozenAmount = preauthFrozenAmount;
        return this;
    }
    public Long getPreauthFrozenAmount() {
        return this.preauthFrozenAmount;
    }

    public QuerySignSchemeResponse setSignedOverdueMinutes(Long signedOverdueMinutes) {
        this.signedOverdueMinutes = signedOverdueMinutes;
        return this;
    }
    public Long getSignedOverdueMinutes() {
        return this.signedOverdueMinutes;
    }

    public QuerySignSchemeResponse setActions(java.util.List<SignActionInfo> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<SignActionInfo> getActions() {
        return this.actions;
    }

}

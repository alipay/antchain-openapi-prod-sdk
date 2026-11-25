// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class VerifyAntchainDasKyaServiceaccessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行前核验总结果：ALLOW 或 DENY；仅 ALLOW 可执行目标业务。
    @NameInMap("decision")
    public String decision;

    // 本次核验决策 ID，可用于审计和排查。
    @NameInMap("decision_id")
    public String decisionId;

    // 拒绝时的具体原因码；放行时为空。
    @NameInMap("reason_code")
    public String reasonCode;

    // 身份、AAP、意图与范围三项逐项核验结果。各项为 PASS、FAIL 或 NOT_REQUIRED。
    @NameInMap("checks")
    public KyaInvocationChecks checks;

    public static VerifyAntchainDasKyaServiceaccessResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainDasKyaServiceaccessResponse self = new VerifyAntchainDasKyaServiceaccessResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainDasKyaServiceaccessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setDecisionId(String decisionId) {
        this.decisionId = decisionId;
        return this;
    }
    public String getDecisionId() {
        return this.decisionId;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public VerifyAntchainDasKyaServiceaccessResponse setChecks(KyaInvocationChecks checks) {
        this.checks = checks;
        return this;
    }
    public KyaInvocationChecks getChecks() {
        return this.checks;
    }

}

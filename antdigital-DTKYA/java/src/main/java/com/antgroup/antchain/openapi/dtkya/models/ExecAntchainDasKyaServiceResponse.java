// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ExecAntchainDasKyaServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结论：ALLOW 或 DENY；DENY 时不调用服务。
    @NameInMap("decision")
    public String decision;

    // 本次核验决策 ID，便于审计和排查。
    @NameInMap("decision_id")
    public String decisionId;

    // 拒绝或执行失败的原因码；成功时为空。
    @NameInMap("reason_code")
    public String reasonCode;

    // 服务执行结果的 JSON 字符串；拒绝时为空。
    @NameInMap("result_json")
    public String resultJson;

    // 服务执行状态：SUCCESS、UPSTREAM_ERROR 或 NOT_EXECUTED。
    @NameInMap("execution_status")
    public String executionStatus;

    public static ExecAntchainDasKyaServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntchainDasKyaServiceResponse self = new ExecAntchainDasKyaServiceResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntchainDasKyaServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntchainDasKyaServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntchainDasKyaServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntchainDasKyaServiceResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public ExecAntchainDasKyaServiceResponse setDecisionId(String decisionId) {
        this.decisionId = decisionId;
        return this;
    }
    public String getDecisionId() {
        return this.decisionId;
    }

    public ExecAntchainDasKyaServiceResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public ExecAntchainDasKyaServiceResponse setResultJson(String resultJson) {
        this.resultJson = resultJson;
        return this;
    }
    public String getResultJson() {
        return this.resultJson;
    }

    public ExecAntchainDasKyaServiceResponse setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

}

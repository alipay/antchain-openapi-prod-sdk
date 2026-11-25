// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLtworeviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原业务幂等请求 ID
    @NameInMap("request_id")
    public String requestId;

    // 已处理审核事项所属 Agent DID
    @NameInMap("agent_did")
    public String agentDid;

    // 已完成的审核事项 ID
    @NameInMap("review_id")
    public String reviewId;

    // 已保存的控制者结论
    @NameInMap("decision")
    public String decision;

    // 本次写入人工标签的 Turn 数量
    @NameInMap("labeled_turns")
    public String labeledTurns;

    // 场景画像异步重训状态
    @NameInMap("baseline_update_status")
    public String baselineUpdateStatus;

    public static PushAntchainDasKyaLtworeviewResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLtworeviewResponse self = new PushAntchainDasKyaLtworeviewResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLtworeviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasKyaLtworeviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasKyaLtworeviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasKyaLtworeviewResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushAntchainDasKyaLtworeviewResponse setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaLtworeviewResponse setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public String getReviewId() {
        return this.reviewId;
    }

    public PushAntchainDasKyaLtworeviewResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public PushAntchainDasKyaLtworeviewResponse setLabeledTurns(String labeledTurns) {
        this.labeledTurns = labeledTurns;
        return this;
    }
    public String getLabeledTurns() {
        return this.labeledTurns;
    }

    public PushAntchainDasKyaLtworeviewResponse setBaselineUpdateStatus(String baselineUpdateStatus) {
        this.baselineUpdateStatus = baselineUpdateStatus;
        return this;
    }
    public String getBaselineUpdateStatus() {
        return this.baselineUpdateStatus;
    }

}

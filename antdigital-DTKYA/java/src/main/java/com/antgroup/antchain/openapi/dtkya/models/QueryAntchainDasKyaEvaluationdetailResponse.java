// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 评测id
    @NameInMap("evaluation_id")
    public String evaluationId;

    // 测评编码
    @NameInMap("service_code")
    public String serviceCode;

    // 评测提供方did
    @NameInMap("provider_did")
    public String providerDid;

    // agentDid
    @NameInMap("agent_did")
    public String agentDid;

    // 评测状态
    @NameInMap("status")
    public String status;

    // 创建时间
    @NameInMap("create_time")
    public String createTime;

    // 开始时间
    @NameInMap("start_time")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    public String endTime;

    // 评测结果
    @NameInMap("result_content")
    public String resultContent;

    // vc
    @NameInMap("vc_content")
    public String vcContent;

    public static QueryAntchainDasKyaEvaluationdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationdetailResponse self = new QueryAntchainDasKyaEvaluationdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setProviderDid(String providerDid) {
        this.providerDid = providerDid;
        return this;
    }
    public String getProviderDid() {
        return this.providerDid;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setResultContent(String resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public String getResultContent() {
        return this.resultContent;
    }

    public QueryAntchainDasKyaEvaluationdetailResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}

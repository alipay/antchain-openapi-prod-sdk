// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaEvaluationlistResponse extends TeaModel {
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

    // 评测服务编码
    @NameInMap("service_code")
    public String serviceCode;

    // 评测提供方did
    @NameInMap("provider_did")
    public String providerDid;

    // 评测状态
    @NameInMap("status")
    public String status;

    // 评测创建时间
    @NameInMap("create_time")
    public String createTime;

    // 评测开始时间
    @NameInMap("start_time")
    public String startTime;

    // 评测结束时间
    @NameInMap("end_time")
    public String endTime;

    public static QueryAntchainDasKyaEvaluationlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaEvaluationlistResponse self = new QueryAntchainDasKyaEvaluationlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaEvaluationlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }
    public String getEvaluationId() {
        return this.evaluationId;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setProviderDid(String providerDid) {
        this.providerDid = providerDid;
        return this;
    }
    public String getProviderDid() {
        return this.providerDid;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAntchainDasKyaEvaluationlistResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}

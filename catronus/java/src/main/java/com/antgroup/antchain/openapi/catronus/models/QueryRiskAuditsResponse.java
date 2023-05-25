// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryRiskAuditsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险任务审计
    @NameInMap("risk_task_audits")
    public java.util.List<RiskTaskAudit> riskTaskAudits;

    public static QueryRiskAuditsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskAuditsResponse self = new QueryRiskAuditsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskAuditsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskAuditsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskAuditsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskAuditsResponse setRiskTaskAudits(java.util.List<RiskTaskAudit> riskTaskAudits) {
        this.riskTaskAudits = riskTaskAudits;
        return this;
    }
    public java.util.List<RiskTaskAudit> getRiskTaskAudits() {
        return this.riskTaskAudits;
    }

}

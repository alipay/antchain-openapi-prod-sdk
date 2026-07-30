// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpOfflinehostplanDecisionresultsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 托管计划编码
    @NameInMap("plan_code")
    public String planCode;

    // 分层结果信息
    @NameInMap("decision_info")
    public java.util.List<DecisionInfo> decisionInfo;

    public static QueryQmpOfflinehostplanDecisionresultsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpOfflinehostplanDecisionresultsResponse self = new QueryQmpOfflinehostplanDecisionresultsResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpOfflinehostplanDecisionresultsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpOfflinehostplanDecisionresultsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpOfflinehostplanDecisionresultsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpOfflinehostplanDecisionresultsResponse setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public QueryQmpOfflinehostplanDecisionresultsResponse setDecisionInfo(java.util.List<DecisionInfo> decisionInfo) {
        this.decisionInfo = decisionInfo;
        return this;
    }
    public java.util.List<DecisionInfo> getDecisionInfo() {
        return this.decisionInfo;
    }

}

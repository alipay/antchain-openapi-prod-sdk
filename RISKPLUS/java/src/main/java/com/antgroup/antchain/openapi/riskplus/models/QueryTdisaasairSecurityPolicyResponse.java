// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryTdisaasairSecurityPolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 场景分
    @NameInMap("model_details")
    public java.util.List<ModelDetails> modelDetails;

    // 安全请求id
    // 
    @NameInMap("security_id")
    public String securityId;

    // 策略结果
    // 
    @NameInMap("security_result")
    public String securityResult;

    // 策略结果详情
    // 
    @NameInMap("strategy_details")
    public java.util.List<StrategyDetails> strategyDetails;

    // 决策流信息
    // 
    @NameInMap("df_scene_infos")
    public java.util.List<DfSceneInfos> dfSceneInfos;

    public static QueryTdisaasairSecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTdisaasairSecurityPolicyResponse self = new QueryTdisaasairSecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryTdisaasairSecurityPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTdisaasairSecurityPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTdisaasairSecurityPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTdisaasairSecurityPolicyResponse setModelDetails(java.util.List<ModelDetails> modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public java.util.List<ModelDetails> getModelDetails() {
        return this.modelDetails;
    }

    public QueryTdisaasairSecurityPolicyResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QueryTdisaasairSecurityPolicyResponse setSecurityResult(String securityResult) {
        this.securityResult = securityResult;
        return this;
    }
    public String getSecurityResult() {
        return this.securityResult;
    }

    public QueryTdisaasairSecurityPolicyResponse setStrategyDetails(java.util.List<StrategyDetails> strategyDetails) {
        this.strategyDetails = strategyDetails;
        return this;
    }
    public java.util.List<StrategyDetails> getStrategyDetails() {
        return this.strategyDetails;
    }

    public QueryTdisaasairSecurityPolicyResponse setDfSceneInfos(java.util.List<DfSceneInfos> dfSceneInfos) {
        this.dfSceneInfos = dfSceneInfos;
        return this;
    }
    public java.util.List<DfSceneInfos> getDfSceneInfos() {
        return this.dfSceneInfos;
    }

}

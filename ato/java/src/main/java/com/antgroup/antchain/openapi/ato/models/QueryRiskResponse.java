// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求唯一ID标识，为空则是异常
    @NameInMap("security_id")
    public String securityId;

    // 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
    @NameInMap("decision")
    public String decision;

    // 风险场景的决策结果
    @NameInMap("scenes")
    public java.util.List<RiskScene> scenes;

    // 策略结果详情
    @NameInMap("strategies")
    public java.util.List<RiskStrategy> strategies;

    // 模型结果详情
    @NameInMap("models")
    public java.util.List<RiskModel> models;

    public static QueryRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskResponse self = new QueryRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QueryRiskResponse setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public QueryRiskResponse setScenes(java.util.List<RiskScene> scenes) {
        this.scenes = scenes;
        return this;
    }
    public java.util.List<RiskScene> getScenes() {
        return this.scenes;
    }

    public QueryRiskResponse setStrategies(java.util.List<RiskStrategy> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<RiskStrategy> getStrategies() {
        return this.strategies;
    }

    public QueryRiskResponse setModels(java.util.List<RiskModel> models) {
        this.models = models;
        return this;
    }
    public java.util.List<RiskModel> getModels() {
        return this.models;
    }

}

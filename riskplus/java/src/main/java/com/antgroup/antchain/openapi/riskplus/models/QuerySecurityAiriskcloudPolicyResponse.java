// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityAiriskcloudPolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 反馈成功之后的id
    @NameInMap("security_id")
    public String securityId;

    // 安全处理结果，枚举值为：reject[拒绝],valida...
    @NameInMap("security_result")
    public String securityResult;

    // 是否成功
    @NameInMap("success")
    public String success;

    // native场景下的核身id
    @NameInMap("verify_id")
    public String verifyId;

    // h5场景下的核身地址
    @NameInMap("verify_url")
    public String verifyUrl;

    // 场景分
    @NameInMap("model_details")
    public java.util.List<ModelDetails> modelDetails;

    // 输出变量
    @NameInMap("variable_details")
    public java.util.List<VariableDetails> variableDetails;

    // 策略详情
    @NameInMap("strategy_details")
    public java.util.List<StrategyDetails> strategyDetails;

    // 场景决策
    @NameInMap("scene_infos")
    public java.util.List<SceneInfos> sceneInfos;

    // infoCode信息
    @NameInMap("info_codes")
    public java.util.List<AirInfoCodes> infoCodes;

    // 策略输出参数
    @NameInMap("out_params")
    public java.util.List<OutParam> outParams;

    public static QuerySecurityAiriskcloudPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityAiriskcloudPolicyResponse self = new QuerySecurityAiriskcloudPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityAiriskcloudPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityAiriskcloudPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityAiriskcloudPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityAiriskcloudPolicyResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QuerySecurityAiriskcloudPolicyResponse setSecurityResult(String securityResult) {
        this.securityResult = securityResult;
        return this;
    }
    public String getSecurityResult() {
        return this.securityResult;
    }

    public QuerySecurityAiriskcloudPolicyResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public QuerySecurityAiriskcloudPolicyResponse setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public QuerySecurityAiriskcloudPolicyResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public QuerySecurityAiriskcloudPolicyResponse setModelDetails(java.util.List<ModelDetails> modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public java.util.List<ModelDetails> getModelDetails() {
        return this.modelDetails;
    }

    public QuerySecurityAiriskcloudPolicyResponse setVariableDetails(java.util.List<VariableDetails> variableDetails) {
        this.variableDetails = variableDetails;
        return this;
    }
    public java.util.List<VariableDetails> getVariableDetails() {
        return this.variableDetails;
    }

    public QuerySecurityAiriskcloudPolicyResponse setStrategyDetails(java.util.List<StrategyDetails> strategyDetails) {
        this.strategyDetails = strategyDetails;
        return this;
    }
    public java.util.List<StrategyDetails> getStrategyDetails() {
        return this.strategyDetails;
    }

    public QuerySecurityAiriskcloudPolicyResponse setSceneInfos(java.util.List<SceneInfos> sceneInfos) {
        this.sceneInfos = sceneInfos;
        return this;
    }
    public java.util.List<SceneInfos> getSceneInfos() {
        return this.sceneInfos;
    }

    public QuerySecurityAiriskcloudPolicyResponse setInfoCodes(java.util.List<AirInfoCodes> infoCodes) {
        this.infoCodes = infoCodes;
        return this;
    }
    public java.util.List<AirInfoCodes> getInfoCodes() {
        return this.infoCodes;
    }

    public QuerySecurityAiriskcloudPolicyResponse setOutParams(java.util.List<OutParam> outParams) {
        this.outParams = outParams;
        return this;
    }
    public java.util.List<OutParam> getOutParams() {
        return this.outParams;
    }

}

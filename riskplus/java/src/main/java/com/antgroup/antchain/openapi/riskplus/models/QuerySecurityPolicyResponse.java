// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityPolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险咨询情况下返回的风险等级，风险处理不会返回该值
    @NameInMap("level")
    public Long level;

    // 反馈成功之后的id
    @NameInMap("security_id")
    public String securityId;

    // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
    @NameInMap("security_result")
    public String securityResult;

    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public String success;

    // native场景下的核身id
    @NameInMap("verify_id")
    public String verifyId;

    // h5场景下的核身地址
    @NameInMap("verify_url")
    public String verifyUrl;

    // 场景分
    @NameInMap("model_details")
    public ModelDetails modelDetails;

    // 输出变量
    @NameInMap("variable_details")
    public VariableDetails variableDetails;

    // 策略详情
    @NameInMap("strategy_details")
    public StrategyDetails strategyDetails;

    public static QuerySecurityPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityPolicyResponse self = new QuerySecurityPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecurityPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySecurityPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySecurityPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySecurityPolicyResponse setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public QuerySecurityPolicyResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QuerySecurityPolicyResponse setSecurityResult(String securityResult) {
        this.securityResult = securityResult;
        return this;
    }
    public String getSecurityResult() {
        return this.securityResult;
    }

    public QuerySecurityPolicyResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public QuerySecurityPolicyResponse setVerifyId(String verifyId) {
        this.verifyId = verifyId;
        return this;
    }
    public String getVerifyId() {
        return this.verifyId;
    }

    public QuerySecurityPolicyResponse setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }
    public String getVerifyUrl() {
        return this.verifyUrl;
    }

    public QuerySecurityPolicyResponse setModelDetails(ModelDetails modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public ModelDetails getModelDetails() {
        return this.modelDetails;
    }

    public QuerySecurityPolicyResponse setVariableDetails(VariableDetails variableDetails) {
        this.variableDetails = variableDetails;
        return this;
    }
    public VariableDetails getVariableDetails() {
        return this.variableDetails;
    }

    public QuerySecurityPolicyResponse setStrategyDetails(StrategyDetails strategyDetails) {
        this.strategyDetails = strategyDetails;
        return this;
    }
    public StrategyDetails getStrategyDetails() {
        return this.strategyDetails;
    }

}

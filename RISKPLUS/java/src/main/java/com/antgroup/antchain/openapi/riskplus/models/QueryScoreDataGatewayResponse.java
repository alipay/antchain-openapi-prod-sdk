// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryScoreDataGatewayResponse extends TeaModel {
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

    // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
    @NameInMap("security_result")
    public String securityResult;

    // 1
    @NameInMap("model_details")
    public ModelDetails modelDetails;

    // 变量
    @NameInMap("variable_details")
    public VariableDetails variableDetails;

    // 成功标识
    @NameInMap("success")
    public Boolean success;

    public static QueryScoreDataGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScoreDataGatewayResponse self = new QueryScoreDataGatewayResponse();
        return TeaModel.build(map, self);
    }

    public QueryScoreDataGatewayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScoreDataGatewayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScoreDataGatewayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScoreDataGatewayResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public QueryScoreDataGatewayResponse setSecurityResult(String securityResult) {
        this.securityResult = securityResult;
        return this;
    }
    public String getSecurityResult() {
        return this.securityResult;
    }

    public QueryScoreDataGatewayResponse setModelDetails(ModelDetails modelDetails) {
        this.modelDetails = modelDetails;
        return this;
    }
    public ModelDetails getModelDetails() {
        return this.modelDetails;
    }

    public QueryScoreDataGatewayResponse setVariableDetails(VariableDetails variableDetails) {
        this.variableDetails = variableDetails;
        return this;
    }
    public VariableDetails getVariableDetails() {
        return this.variableDetails;
    }

    public QueryScoreDataGatewayResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QuerySecurityPolicyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 风险咨询情况下返回的风险等级，风险处理不会返回该值
    @NameInMap("level")
    public Integer level;

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

    // 有风险需要失败业务情况下的返回码
    @NameInMap("template_code")
    public String templateCode;

    // 有风险需要失败业务情况下的返回码描述
    @NameInMap("template_desc")
    public String templateDesc;

    // native场景下的核身id
    @NameInMap("verify_id")
    public String verifyId;

    // h5场景下的核身地址
    @NameInMap("verify_url")
    public String verifyUrl;

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

    public QuerySecurityPolicyResponse setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
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

    public QuerySecurityPolicyResponse setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QuerySecurityPolicyResponse setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }
    public String getTemplateDesc() {
        return this.templateDesc;
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

}

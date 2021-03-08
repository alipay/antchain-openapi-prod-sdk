// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListPolicyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 授权策略列表
    @NameInMap("policies")
    @Validation(required = true)
    public java.util.List<AuthPolicy> policies;

    public static ListPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyResponse self = new ListPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListPolicyResponse setPolicies(java.util.List<AuthPolicy> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<AuthPolicy> getPolicies() {
        return this.policies;
    }

}

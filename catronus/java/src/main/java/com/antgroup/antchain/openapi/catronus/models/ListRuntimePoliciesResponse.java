// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ListRuntimePoliciesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 策略列表
    @NameInMap("policy_list")
    public java.util.List<String> policyList;

    public static ListRuntimePoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimePoliciesResponse self = new ListRuntimePoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListRuntimePoliciesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRuntimePoliciesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRuntimePoliciesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRuntimePoliciesResponse setPolicyList(java.util.List<String> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<String> getPolicyList() {
        return this.policyList;
    }

}

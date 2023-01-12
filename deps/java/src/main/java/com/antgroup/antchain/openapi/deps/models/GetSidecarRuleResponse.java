// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarRuleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // sidecar rule结构体
    @NameInMap("sidecar_rule")
    public SidecarRule sidecarRule;

    public static GetSidecarRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarRuleResponse self = new GetSidecarRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSidecarRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetSidecarRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetSidecarRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetSidecarRuleResponse setSidecarRule(SidecarRule sidecarRule) {
        this.sidecarRule = sidecarRule;
        return this;
    }
    public SidecarRule getSidecarRule() {
        return this.sidecarRule;
    }

}

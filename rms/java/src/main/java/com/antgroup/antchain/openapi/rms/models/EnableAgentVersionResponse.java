// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class EnableAgentVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本信息
    @NameInMap("agent_version")
    public AgentVersion agentVersion;

    public static EnableAgentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAgentVersionResponse self = new EnableAgentVersionResponse();
        return TeaModel.build(map, self);
    }

    public EnableAgentVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EnableAgentVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EnableAgentVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EnableAgentVersionResponse setAgentVersion(AgentVersion agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public AgentVersion getAgentVersion() {
        return this.agentVersion;
    }

}

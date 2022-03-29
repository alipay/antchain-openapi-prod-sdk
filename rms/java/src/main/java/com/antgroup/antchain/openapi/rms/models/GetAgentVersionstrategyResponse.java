// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAgentVersionstrategyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // agent 版本策略
    @NameInMap("agent_version_strategy")
    public AgentVersionStrategy agentVersionStrategy;

    public static GetAgentVersionstrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentVersionstrategyResponse self = new GetAgentVersionstrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentVersionstrategyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAgentVersionstrategyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAgentVersionstrategyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAgentVersionstrategyResponse setAgentVersionStrategy(AgentVersionStrategy agentVersionStrategy) {
        this.agentVersionStrategy = agentVersionStrategy;
        return this;
    }
    public AgentVersionStrategy getAgentVersionStrategy() {
        return this.agentVersionStrategy;
    }

}

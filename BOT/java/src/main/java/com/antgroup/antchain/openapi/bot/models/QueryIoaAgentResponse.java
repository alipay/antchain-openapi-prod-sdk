// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIoaAgentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 智能体信息视图对象
    @NameInMap("agent_info")
    public AgentInfoVO agentInfo;

    public static QueryIoaAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIoaAgentResponse self = new QueryIoaAgentResponse();
        return TeaModel.build(map, self);
    }

    public QueryIoaAgentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIoaAgentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIoaAgentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIoaAgentResponse setAgentInfo(AgentInfoVO agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }
    public AgentInfoVO getAgentInfo() {
        return this.agentInfo;
    }

}

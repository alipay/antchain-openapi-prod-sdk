// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DetailBlockchainBotIotagentAgentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 智能体详情
    @NameInMap("agent_info")
    public AgentInfo agentInfo;

    public static DetailBlockchainBotIotagentAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailBlockchainBotIotagentAgentResponse self = new DetailBlockchainBotIotagentAgentResponse();
        return TeaModel.build(map, self);
    }

    public DetailBlockchainBotIotagentAgentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailBlockchainBotIotagentAgentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailBlockchainBotIotagentAgentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailBlockchainBotIotagentAgentResponse setAgentInfo(AgentInfo agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }
    public AgentInfo getAgentInfo() {
        return this.agentInfo;
    }

}

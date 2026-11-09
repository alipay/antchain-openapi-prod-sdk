// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasLtwoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // Agent DID
    @NameInMap("agent_did")
    public String agentDid;

    // L2 启用状态
    @NameInMap("enabled")
    public Boolean enabled;

    // L2 当前状态
    @NameInMap("l2_status")
    public String l2Status;

    // 更新时间
    @NameInMap("updated_at")
    public String updatedAt;

    public static PushAntchainDasLtwoResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasLtwoResponse self = new PushAntchainDasLtwoResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasLtwoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasLtwoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasLtwoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasLtwoResponse setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasLtwoResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PushAntchainDasLtwoResponse setL2Status(String l2Status) {
        this.l2Status = l2Status;
        return this;
    }
    public String getL2Status() {
        return this.l2Status;
    }

    public PushAntchainDasLtwoResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

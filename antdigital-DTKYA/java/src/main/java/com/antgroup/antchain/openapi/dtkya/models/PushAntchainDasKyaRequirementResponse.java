// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaRequirementResponse extends TeaModel {
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

    // 对端须通过的层级
    @NameInMap("required_levels")
    public java.util.List<String> requiredLevels;

    // 设置更新时间，RFC3339
    @NameInMap("updated_at")
    public String updatedAt;

    public static PushAntchainDasKyaRequirementResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaRequirementResponse self = new PushAntchainDasKyaRequirementResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaRequirementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasKyaRequirementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasKyaRequirementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasKyaRequirementResponse setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaRequirementResponse setRequiredLevels(java.util.List<String> requiredLevels) {
        this.requiredLevels = requiredLevels;
        return this;
    }
    public java.util.List<String> getRequiredLevels() {
        return this.requiredLevels;
    }

    public PushAntchainDasKyaRequirementResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

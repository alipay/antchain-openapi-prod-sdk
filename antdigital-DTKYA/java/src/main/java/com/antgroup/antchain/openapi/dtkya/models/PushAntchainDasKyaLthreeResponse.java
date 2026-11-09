// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLthreeResponse extends TeaModel {
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

    // L3 是否启用
    @NameInMap("enabled")
    public Boolean enabled;

    // L3 当前状态
    @NameInMap("l3_status")
    public String l3Status;

    // 已绑定实体 DID，无绑定时为空
    @NameInMap("entity_did")
    public String entityDid;

    // 设置更新时间，RFC3339
    @NameInMap("updated_at")
    public String updatedAt;

    public static PushAntchainDasKyaLthreeResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLthreeResponse self = new PushAntchainDasKyaLthreeResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLthreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasKyaLthreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasKyaLthreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasKyaLthreeResponse setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaLthreeResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PushAntchainDasKyaLthreeResponse setL3Status(String l3Status) {
        this.l3Status = l3Status;
        return this;
    }
    public String getL3Status() {
        return this.l3Status;
    }

    public PushAntchainDasKyaLthreeResponse setEntityDid(String entityDid) {
        this.entityDid = entityDid;
        return this;
    }
    public String getEntityDid() {
        return this.entityDid;
    }

    public PushAntchainDasKyaLthreeResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

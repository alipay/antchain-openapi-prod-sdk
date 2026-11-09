// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaEntityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证流程 ID
    @NameInMap("authentication_id")
    public String authenticationId;

    // 认证状态
    @NameInMap("status")
    public String status;

    // 认证成功的实体 DID
    @NameInMap("entity_did")
    public String entityDid;

    // 认证操作入口
    @NameInMap("action_url")
    public String actionUrl;

    // 认证过期时间
    @NameInMap("expires_at")
    public String expiresAt;

    // 结果原因码
    @NameInMap("reason_code")
    public String reasonCode;

    // 结果原因
    @NameInMap("reason")
    public String reason;

    public static RegisterAntchainDasKyaEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaEntityResponse self = new RegisterAntchainDasKyaEntityResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaEntityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RegisterAntchainDasKyaEntityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RegisterAntchainDasKyaEntityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RegisterAntchainDasKyaEntityResponse setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
        return this;
    }
    public String getAuthenticationId() {
        return this.authenticationId;
    }

    public RegisterAntchainDasKyaEntityResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RegisterAntchainDasKyaEntityResponse setEntityDid(String entityDid) {
        this.entityDid = entityDid;
        return this;
    }
    public String getEntityDid() {
        return this.entityDid;
    }

    public RegisterAntchainDasKyaEntityResponse setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
        return this;
    }
    public String getActionUrl() {
        return this.actionUrl;
    }

    public RegisterAntchainDasKyaEntityResponse setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public RegisterAntchainDasKyaEntityResponse setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public RegisterAntchainDasKyaEntityResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}

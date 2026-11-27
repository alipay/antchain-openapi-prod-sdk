// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class GrantAntchainDasKyaAapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次用户确认的授权 ID；关联多个协议。
    @NameInMap("authorization_id")
    public String authorizationId;

    // 本次授权包含的 AAP 协议 resourceId 列表。
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    // 授权受理状态，待用户确认或待凭据核验
    @NameInMap("status")
    public String status;

    // 本次授权截止时间
    @NameInMap("expires_at")
    public String expiresAt;

    public static GrantAntchainDasKyaAapResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAntchainDasKyaAapResponse self = new GrantAntchainDasKyaAapResponse();
        return TeaModel.build(map, self);
    }

    public GrantAntchainDasKyaAapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GrantAntchainDasKyaAapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GrantAntchainDasKyaAapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GrantAntchainDasKyaAapResponse setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public GrantAntchainDasKyaAapResponse setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public GrantAntchainDasKyaAapResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrantAntchainDasKyaAapResponse setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

}

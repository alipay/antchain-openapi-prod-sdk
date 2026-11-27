// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class QueryAntchainDasKyaAapstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次用户确认的授权 ID；可关联多个 AAP 协议。
    @NameInMap("authorization_id")
    public String authorizationId;

    // 此次授权包含的全部 AAP 协议 resourceId。
    @NameInMap("resource_ids")
    public java.util.List<String> resourceIds;

    // 授权状态：PENDING_USER_CONFIRMATION、ACTIVE、REJECTED 或 EXPIRED。
    @NameInMap("status")
    public String status;

    // 授权到期时间，UTC ISO 8601。
    @NameInMap("expires_at")
    public String expiresAt;

    // 当前是否可使用该授权；仅 ACTIVE 且未过期时为 true。
    @NameInMap("can_invoke")
    public Boolean canInvoke;

    public static QueryAntchainDasKyaAapstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDasKyaAapstatusResponse self = new QueryAntchainDasKyaAapstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDasKyaAapstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainDasKyaAapstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainDasKyaAapstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainDasKyaAapstatusResponse setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public QueryAntchainDasKyaAapstatusResponse setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public QueryAntchainDasKyaAapstatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntchainDasKyaAapstatusResponse setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public QueryAntchainDasKyaAapstatusResponse setCanInvoke(Boolean canInvoke) {
        this.canInvoke = canInvoke;
        return this;
    }
    public Boolean getCanInvoke() {
        return this.canInvoke;
    }

}

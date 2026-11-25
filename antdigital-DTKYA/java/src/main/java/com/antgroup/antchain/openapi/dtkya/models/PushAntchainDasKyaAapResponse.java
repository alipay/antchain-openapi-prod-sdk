// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaAapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 本次 AAP 授权实例 ID
    @NameInMap("aap_id")
    public String aapId;

    // 对应的 AAP 授权模板 ID
    @NameInMap("resource_id")
    public String resourceId;

    // 授权受理状态，待用户确认或待凭据核验
    @NameInMap("status")
    public String status;

    // 本次授权截止时间
    @NameInMap("expires_at")
    public String expiresAt;

    public static PushAntchainDasKyaAapResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaAapResponse self = new PushAntchainDasKyaAapResponse();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaAapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAntchainDasKyaAapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAntchainDasKyaAapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAntchainDasKyaAapResponse setAapId(String aapId) {
        this.aapId = aapId;
        return this;
    }
    public String getAapId() {
        return this.aapId;
    }

    public PushAntchainDasKyaAapResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public PushAntchainDasKyaAapResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PushAntchainDasKyaAapResponse setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

}

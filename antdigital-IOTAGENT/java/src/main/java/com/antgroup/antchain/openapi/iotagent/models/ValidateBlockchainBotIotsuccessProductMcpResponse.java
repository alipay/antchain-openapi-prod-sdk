// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ValidateBlockchainBotIotsuccessProductMcpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("reachable")
    @Validation(required = true)
    public Boolean reachable;

    // 应用层鉴权结果；无可判定认证机制时为null，WebSocket握手不等于鉴权成功
    @NameInMap("authenticated")
    @Validation(required = true)
    public Boolean authenticated;

    // 完成initialize及initialized通知和tools/list；仅握手成功不得为true
    @NameInMap("protocol_ready")
    @Validation(required = true)
    public Boolean protocolReady;

    @NameInMap("latency_ms")
    @Validation(required = true)
    public Long latencyMs;

    public static ValidateBlockchainBotIotsuccessProductMcpResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateBlockchainBotIotsuccessProductMcpResponse self = new ValidateBlockchainBotIotsuccessProductMcpResponse();
        return TeaModel.build(map, self);
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setReachable(Boolean reachable) {
        this.reachable = reachable;
        return this;
    }
    public Boolean getReachable() {
        return this.reachable;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }
    public Boolean getAuthenticated() {
        return this.authenticated;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setProtocolReady(Boolean protocolReady) {
        this.protocolReady = protocolReady;
        return this;
    }
    public Boolean getProtocolReady() {
        return this.protocolReady;
    }

    public ValidateBlockchainBotIotsuccessProductMcpResponse setLatencyMs(Long latencyMs) {
        this.latencyMs = latencyMs;
        return this;
    }
    public Long getLatencyMs() {
        return this.latencyMs;
    }

}

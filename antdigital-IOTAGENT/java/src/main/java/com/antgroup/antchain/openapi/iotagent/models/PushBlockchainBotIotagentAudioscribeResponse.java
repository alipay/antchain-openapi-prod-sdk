// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PushBlockchainBotIotagentAudioscribeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("type")
    public String type;

    @NameInMap("message_id")
    public String messageId;

    @NameInMap("target_plugin_id")
    public String targetPluginId;

    @NameInMap("message_type")
    public String messageType;

    // 业务响应，json格式
    @NameInMap("payload")
    public String payload;

    // Unix Epoch 毫秒
    @NameInMap("timestamp")
    public Long timestamp;

    public static PushBlockchainBotIotagentAudioscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainBotIotagentAudioscribeResponse self = new PushBlockchainBotIotagentAudioscribeResponse();
        return TeaModel.build(map, self);
    }

    public PushBlockchainBotIotagentAudioscribeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setTargetPluginId(String targetPluginId) {
        this.targetPluginId = targetPluginId;
        return this;
    }
    public String getTargetPluginId() {
        return this.targetPluginId;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public PushBlockchainBotIotagentAudioscribeResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}

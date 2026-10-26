// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushIotagentAudioscribeResponse extends TeaModel {
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

    public static PushIotagentAudioscribeResponse build(java.util.Map<String, ?> map) throws Exception {
        PushIotagentAudioscribeResponse self = new PushIotagentAudioscribeResponse();
        return TeaModel.build(map, self);
    }

    public PushIotagentAudioscribeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushIotagentAudioscribeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushIotagentAudioscribeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushIotagentAudioscribeResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PushIotagentAudioscribeResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushIotagentAudioscribeResponse setTargetPluginId(String targetPluginId) {
        this.targetPluginId = targetPluginId;
        return this;
    }
    public String getTargetPluginId() {
        return this.targetPluginId;
    }

    public PushIotagentAudioscribeResponse setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public PushIotagentAudioscribeResponse setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public PushIotagentAudioscribeResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}

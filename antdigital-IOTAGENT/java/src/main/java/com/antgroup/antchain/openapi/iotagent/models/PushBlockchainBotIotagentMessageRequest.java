// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PushBlockchainBotIotagentMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消息ID，用于幂等
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 指令类型。消息播报用 AUDIO_BROADCAST；未来可扩展其他指令
    @NameInMap("operation_type")
    @Validation(required = true)
    public String operationType;

    // 播报/指令文案
    @NameInMap("instruction")
    @Validation(required = true)
    public String instruction;

    // 已解析的设备身份（tenantId/agentId/clientType/clientId/sessionId），非aiotdatalink调用时，需传；
    // aiotdatalink调用时，不传。
    @NameInMap("source")
    public String source;

    // 用户身份ID，source 没传时用，当aiotdatalink调用时必传
    @NameInMap("out_user_id")
    public String outUserId;

    // 用户身份类型，source没传时用，当aiotdatalink调用时必传
    // 取值范围：ALIPAY_UID->支付宝UID;
    @NameInMap("out_user_type")
    public String outUserType;

    // 业务扩展信息宽字段，值是有效的json。aiotdatalink调用时的AntFinanceAssistant业务消息字段（screenText/screenTip/messageType/generatedTime/contextId/contextExpireTime/priority 等）放这里
    @NameInMap("extra_info")
    public String extraInfo;

    // 最晚允许播放时间。超时消息不播报
    @NameInMap("expire_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    public static PushBlockchainBotIotagentMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainBotIotagentMessageRequest self = new PushBlockchainBotIotagentMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushBlockchainBotIotagentMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBlockchainBotIotagentMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBlockchainBotIotagentMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushBlockchainBotIotagentMessageRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public PushBlockchainBotIotagentMessageRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public PushBlockchainBotIotagentMessageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PushBlockchainBotIotagentMessageRequest setOutUserId(String outUserId) {
        this.outUserId = outUserId;
        return this;
    }
    public String getOutUserId() {
        return this.outUserId;
    }

    public PushBlockchainBotIotagentMessageRequest setOutUserType(String outUserType) {
        this.outUserType = outUserType;
        return this;
    }
    public String getOutUserType() {
        return this.outUserType;
    }

    public PushBlockchainBotIotagentMessageRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public PushBlockchainBotIotagentMessageRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

}

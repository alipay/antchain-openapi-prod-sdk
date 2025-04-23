// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class XMessageInfo extends TeaModel {
    // 消息事件编码
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 消费方id，例如appId，tenantId
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 消费者类型，例如TENANT, APP
    @NameInMap("consumer_type")
    @Validation(required = true)
    public String consumerType;

    // 业务消息内容，json格式
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 消息发送过程中的唯一ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    public static XMessageInfo build(java.util.Map<String, ?> map) throws Exception {
        XMessageInfo self = new XMessageInfo();
        return TeaModel.build(map, self);
    }

    public XMessageInfo setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public XMessageInfo setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public XMessageInfo setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public XMessageInfo setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public XMessageInfo setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}

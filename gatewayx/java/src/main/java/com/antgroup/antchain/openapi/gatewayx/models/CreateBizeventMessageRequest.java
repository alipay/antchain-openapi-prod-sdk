// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class CreateBizeventMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务消息内容，json格式
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 日期对应的timestamp
    @NameInMap("utc_timestamp")
    @Validation(required = true)
    public Long utcTimestamp;

    // 消息发送过程中的唯一ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 消息事件编码
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 消费方id，例如appId，tenantId，可以多个，多个之间使用","分割
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 消费者类型，例如TENANT, APP
    @NameInMap("consumer_type")
    @Validation(required = true)
    public String consumerType;

    // 二级消息主题,订阅方可以过滤消息
    @NameInMap("tags")
    public String tags;

    // 消息类型，1：点对点，2: 广播消息
    @NameInMap("msg_type")
    @Validation(required = true)
    public String msgType;

    public static CreateBizeventMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizeventMessageRequest self = new CreateBizeventMessageRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizeventMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBizeventMessageRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public CreateBizeventMessageRequest setUtcTimestamp(Long utcTimestamp) {
        this.utcTimestamp = utcTimestamp;
        return this;
    }
    public Long getUtcTimestamp() {
        return this.utcTimestamp;
    }

    public CreateBizeventMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public CreateBizeventMessageRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public CreateBizeventMessageRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateBizeventMessageRequest setConsumerType(String consumerType) {
        this.consumerType = consumerType;
        return this;
    }
    public String getConsumerType() {
        return this.consumerType;
    }

    public CreateBizeventMessageRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public CreateBizeventMessageRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

}

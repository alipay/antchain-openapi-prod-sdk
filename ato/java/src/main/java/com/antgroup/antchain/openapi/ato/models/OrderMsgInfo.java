// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderMsgInfo extends TeaModel {
    // 订单id
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 消息ID
    // 
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 消息类型
    // 
    @NameInMap("msg_publish_type")
    @Validation(required = true)
    public String msgPublishType;

    // 消息创建时间
    // 
    @NameInMap("msg_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String msgCreateTime;

    // 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
    @NameInMap("msg_status")
    @Validation(required = true)
    public String msgStatus;

    // 消息重投次数
    // 
    @NameInMap("msg_retry_time")
    @Validation(required = true)
    public Long msgRetryTime;

    // 消息体内容
    @NameInMap("msg_content")
    @Validation(required = true)
    public String msgContent;

    // 消息回调地址
    @NameInMap("msg_callback_url")
    @Validation(required = true)
    public String msgCallbackUrl;

    // 新回调地址
    @NameInMap("new_msg_callback_url")
    @Validation(required = true)
    public String newMsgCallbackUrl;

    public static OrderMsgInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderMsgInfo self = new OrderMsgInfo();
        return TeaModel.build(map, self);
    }

    public OrderMsgInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderMsgInfo setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OrderMsgInfo setMsgPublishType(String msgPublishType) {
        this.msgPublishType = msgPublishType;
        return this;
    }
    public String getMsgPublishType() {
        return this.msgPublishType;
    }

    public OrderMsgInfo setMsgCreateTime(String msgCreateTime) {
        this.msgCreateTime = msgCreateTime;
        return this;
    }
    public String getMsgCreateTime() {
        return this.msgCreateTime;
    }

    public OrderMsgInfo setMsgStatus(String msgStatus) {
        this.msgStatus = msgStatus;
        return this;
    }
    public String getMsgStatus() {
        return this.msgStatus;
    }

    public OrderMsgInfo setMsgRetryTime(Long msgRetryTime) {
        this.msgRetryTime = msgRetryTime;
        return this;
    }
    public Long getMsgRetryTime() {
        return this.msgRetryTime;
    }

    public OrderMsgInfo setMsgContent(String msgContent) {
        this.msgContent = msgContent;
        return this;
    }
    public String getMsgContent() {
        return this.msgContent;
    }

    public OrderMsgInfo setMsgCallbackUrl(String msgCallbackUrl) {
        this.msgCallbackUrl = msgCallbackUrl;
        return this;
    }
    public String getMsgCallbackUrl() {
        return this.msgCallbackUrl;
    }

    public OrderMsgInfo setNewMsgCallbackUrl(String newMsgCallbackUrl) {
        this.newMsgCallbackUrl = newMsgCallbackUrl;
        return this;
    }
    public String getNewMsgCallbackUrl() {
        return this.newMsgCallbackUrl;
    }

}

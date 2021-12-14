// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class SendEventDirectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 事件码
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 事件参数
    @NameInMap("event_params")
    public java.util.List<KeyValuePair> eventParams;

    // 接收者
    @NameInMap("event_receiver")
    @Validation(required = true)
    public EventReceiver eventReceiver;

    // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
    @NameInMap("sender")
    @Validation(required = true)
    public String sender;

    // 用于描述sender
    @NameInMap("sender_name")
    public String senderName;

    public static SendEventDirectRequest build(java.util.Map<String, ?> map) throws Exception {
        SendEventDirectRequest self = new SendEventDirectRequest();
        return TeaModel.build(map, self);
    }

    public SendEventDirectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendEventDirectRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public SendEventDirectRequest setEventParams(java.util.List<KeyValuePair> eventParams) {
        this.eventParams = eventParams;
        return this;
    }
    public java.util.List<KeyValuePair> getEventParams() {
        return this.eventParams;
    }

    public SendEventDirectRequest setEventReceiver(EventReceiver eventReceiver) {
        this.eventReceiver = eventReceiver;
        return this;
    }
    public EventReceiver getEventReceiver() {
        return this.eventReceiver;
    }

    public SendEventDirectRequest setSender(String sender) {
        this.sender = sender;
        return this;
    }
    public String getSender() {
        return this.sender;
    }

    public SendEventDirectRequest setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }
    public String getSenderName() {
        return this.senderName;
    }

}

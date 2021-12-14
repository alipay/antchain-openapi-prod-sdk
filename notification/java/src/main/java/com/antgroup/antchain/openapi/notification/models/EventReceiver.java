// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class EventReceiver extends TeaModel {
    // 接收人的有效联系方式
    @NameInMap("receiver")
    @Validation(required = true)
    public String receiver;

    // 接收人联系方式的类型
    @NameInMap("receiver_type")
    @Validation(required = true)
    public String receiverType;

    // 消息发送类型
    @NameInMap("msg_type")
    @Validation(required = true)
    public String msgType;

    public static EventReceiver build(java.util.Map<String, ?> map) throws Exception {
        EventReceiver self = new EventReceiver();
        return TeaModel.build(map, self);
    }

    public EventReceiver setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public EventReceiver setReceiverType(String receiverType) {
        this.receiverType = receiverType;
        return this;
    }
    public String getReceiverType() {
        return this.receiverType;
    }

    public EventReceiver setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

}

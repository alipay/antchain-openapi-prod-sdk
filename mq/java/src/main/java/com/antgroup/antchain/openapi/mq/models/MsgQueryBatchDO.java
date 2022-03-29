// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgQueryBatchDO extends TeaModel {
    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // gmt_create
    @NameInMap("gmt_create")
    public String gmtCreate;

    // message_id
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // status
    @NameInMap("status")
    public String status;

    // subscriber_group_undelivery
    @NameInMap("subscriber_group_undelivery")
    public String subscriberGroupUndelivery;

    public static MsgQueryBatchDO build(java.util.Map<String, ?> map) throws Exception {
        MsgQueryBatchDO self = new MsgQueryBatchDO();
        return TeaModel.build(map, self);
    }

    public MsgQueryBatchDO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public MsgQueryBatchDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MsgQueryBatchDO setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public MsgQueryBatchDO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MsgQueryBatchDO setSubscriberGroupUndelivery(String subscriberGroupUndelivery) {
        this.subscriberGroupUndelivery = subscriberGroupUndelivery;
        return this;
    }
    public String getSubscriberGroupUndelivery() {
        return this.subscriberGroupUndelivery;
    }

}

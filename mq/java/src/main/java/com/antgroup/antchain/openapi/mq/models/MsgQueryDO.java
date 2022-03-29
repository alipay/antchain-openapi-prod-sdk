// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgQueryDO extends TeaModel {
    // delivery_count
    @NameInMap("delivery_count")
    public Long deliveryCount;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_last_delivery
    @NameInMap("gmt_last_delivery")
    @Validation(required = true)
    public String gmtLastDelivery;

    // gmt_next_delivery
    @NameInMap("gmt_next_delivery")
    @Validation(required = true)
    public String gmtNextDelivery;

    // message_id
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // publisher_group
    @NameInMap("publisher_group")
    @Validation(required = true)
    public String publisherGroup;

    // status
    @NameInMap("status")
    public String status;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // transaction
    @NameInMap("transaction")
    public Boolean transaction;

    // subscriber_group_delivery
    @NameInMap("subscriber_group_delivery")
    public String subscriberGroupDelivery;

    // subscriber_group_undelivery
    @NameInMap("subscriber_group_undelivery")
    public String subscriberGroupUndelivery;

    public static MsgQueryDO build(java.util.Map<String, ?> map) throws Exception {
        MsgQueryDO self = new MsgQueryDO();
        return TeaModel.build(map, self);
    }

    public MsgQueryDO setDeliveryCount(Long deliveryCount) {
        this.deliveryCount = deliveryCount;
        return this;
    }
    public Long getDeliveryCount() {
        return this.deliveryCount;
    }

    public MsgQueryDO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public MsgQueryDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MsgQueryDO setGmtLastDelivery(String gmtLastDelivery) {
        this.gmtLastDelivery = gmtLastDelivery;
        return this;
    }
    public String getGmtLastDelivery() {
        return this.gmtLastDelivery;
    }

    public MsgQueryDO setGmtNextDelivery(String gmtNextDelivery) {
        this.gmtNextDelivery = gmtNextDelivery;
        return this;
    }
    public String getGmtNextDelivery() {
        return this.gmtNextDelivery;
    }

    public MsgQueryDO setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public MsgQueryDO setPublisherGroup(String publisherGroup) {
        this.publisherGroup = publisherGroup;
        return this;
    }
    public String getPublisherGroup() {
        return this.publisherGroup;
    }

    public MsgQueryDO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MsgQueryDO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public MsgQueryDO setTransaction(Boolean transaction) {
        this.transaction = transaction;
        return this;
    }
    public Boolean getTransaction() {
        return this.transaction;
    }

    public MsgQueryDO setSubscriberGroupDelivery(String subscriberGroupDelivery) {
        this.subscriberGroupDelivery = subscriberGroupDelivery;
        return this;
    }
    public String getSubscriberGroupDelivery() {
        return this.subscriberGroupDelivery;
    }

    public MsgQueryDO setSubscriberGroupUndelivery(String subscriberGroupUndelivery) {
        this.subscriberGroupUndelivery = subscriberGroupUndelivery;
        return this;
    }
    public String getSubscriberGroupUndelivery() {
        return this.subscriberGroupUndelivery;
    }

}

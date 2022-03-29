// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CountMessageUndeliveryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // subscriber group
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // end time
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    public static CountMessageUndeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CountMessageUndeliveryRequest self = new CountMessageUndeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CountMessageUndeliveryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountMessageUndeliveryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountMessageUndeliveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CountMessageUndeliveryRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public CountMessageUndeliveryRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public CountMessageUndeliveryRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CountMessageUndeliveryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}

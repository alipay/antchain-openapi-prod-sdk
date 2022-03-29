// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UndeliverMessageStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // message type: eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // group of subscriber
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // middleware instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // interval in seconds to the current time
    @NameInMap("interval_in_second")
    @Validation(required = true)
    public Integer intervalInSecond;

    // tenant id
    @NameInMap("tenant")
    public String tenant;

    // message type: topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // workspace id
    @NameInMap("workspace")
    public String workspace;

    public static UndeliverMessageStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UndeliverMessageStatusRequest self = new UndeliverMessageStatusRequest();
        return TeaModel.build(map, self);
    }

    public UndeliverMessageStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UndeliverMessageStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UndeliverMessageStatusRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public UndeliverMessageStatusRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UndeliverMessageStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UndeliverMessageStatusRequest setIntervalInSecond(Integer intervalInSecond) {
        this.intervalInSecond = intervalInSecond;
        return this;
    }
    public Integer getIntervalInSecond() {
        return this.intervalInSecond;
    }

    public UndeliverMessageStatusRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UndeliverMessageStatusRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public UndeliverMessageStatusRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}

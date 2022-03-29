// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class Topic extends TeaModel {
    // creation_time
    @NameInMap("creation_time")
    public String creationTime;

    // desc
    @NameInMap("desc")
    public String desc;

    // eventcode
    @NameInMap("eventcode")
    public String eventcode;

    // id
    @NameInMap("id")
    public String id;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // topic
    @NameInMap("topic")
    public String topic;

    // update_time
    @NameInMap("update_time")
    public String updateTime;

    public static Topic build(java.util.Map<String, ?> map) throws Exception {
        Topic self = new Topic();
        return TeaModel.build(map, self);
    }

    public Topic setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Topic setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public Topic setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public Topic setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Topic setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Topic setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public Topic setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}

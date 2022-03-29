// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgTypeDO extends TeaModel {
    // desc
    @NameInMap("desc")
    public String desc;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // gmt_create
    @NameInMap("gmt_create")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    public String gmtModified;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static MsgTypeDO build(java.util.Map<String, ?> map) throws Exception {
        MsgTypeDO self = new MsgTypeDO();
        return TeaModel.build(map, self);
    }

    public MsgTypeDO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public MsgTypeDO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public MsgTypeDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MsgTypeDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MsgTypeDO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MsgTypeDO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public MsgTypeDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

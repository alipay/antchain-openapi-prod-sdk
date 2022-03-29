// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgTypeDTO extends TeaModel {
    // topic name
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // eventcode
    @NameInMap("eventcode")
    @Validation(required = true)
    public String eventcode;

    // desc
    @NameInMap("desc")
    public String desc;

    public static MsgTypeDTO build(java.util.Map<String, ?> map) throws Exception {
        MsgTypeDTO self = new MsgTypeDTO();
        return TeaModel.build(map, self);
    }

    public MsgTypeDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public MsgTypeDTO setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public MsgTypeDTO setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}

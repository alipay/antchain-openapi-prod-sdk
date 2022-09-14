// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ManagedMQDTOStructBody extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 实例
    @NameInMap("instance")
    public String instance;

    // 主题
    @NameInMap("topic")
    public String topic;

    // 类型
    @NameInMap("type")
    public String type;

    public static ManagedMQDTOStructBody build(java.util.Map<String, ?> map) throws Exception {
        ManagedMQDTOStructBody self = new ManagedMQDTOStructBody();
        return TeaModel.build(map, self);
    }

    public ManagedMQDTOStructBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ManagedMQDTOStructBody setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public ManagedMQDTOStructBody setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ManagedMQDTOStructBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

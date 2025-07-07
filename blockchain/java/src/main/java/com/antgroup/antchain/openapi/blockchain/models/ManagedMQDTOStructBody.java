// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ManagedMQDTOStructBody extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 实例
    /**
     * <strong>example:</strong>
     * <p>&quot;MQ_INST_1287126353308684_BXYEnC3u&quot;</p>
     */
    @NameInMap("instance")
    public String instance;

    // 主题
    /**
     * <strong>example:</strong>
     * <p>&quot;tfx4lb3m0qh3emact73tln8t8qkygb65&quot;</p>
     */
    @NameInMap("topic")
    public String topic;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>&quot;basic&quot;</p>
     */
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

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MsgdumpSourceInfo extends TeaModel {
    // 源 instance id
    @NameInMap("source_instance_id")
    @Validation(required = true)
    public String sourceInstanceId;

    // 源端 topic 列表
    @NameInMap("source_topics")
    @Validation(required = true)
    public java.util.List<SourceTopic> sourceTopics;

    public static MsgdumpSourceInfo build(java.util.Map<String, ?> map) throws Exception {
        MsgdumpSourceInfo self = new MsgdumpSourceInfo();
        return TeaModel.build(map, self);
    }

    public MsgdumpSourceInfo setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public MsgdumpSourceInfo setSourceTopics(java.util.List<SourceTopic> sourceTopics) {
        this.sourceTopics = sourceTopics;
        return this;
    }
    public java.util.List<SourceTopic> getSourceTopics() {
        return this.sourceTopics;
    }

}

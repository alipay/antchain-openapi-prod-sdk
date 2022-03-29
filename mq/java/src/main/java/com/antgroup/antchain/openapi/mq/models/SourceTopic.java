// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SourceTopic extends TeaModel {
    // 源端 topic
    @NameInMap("source_topic")
    @Validation(required = true)
    public String sourceTopic;

    // 此源端 topic 所有的 event code列表
    @NameInMap("source_event_code")
    @Validation(required = true)
    public java.util.List<String> sourceEventCode;

    public static SourceTopic build(java.util.Map<String, ?> map) throws Exception {
        SourceTopic self = new SourceTopic();
        return TeaModel.build(map, self);
    }

    public SourceTopic setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public SourceTopic setSourceEventCode(java.util.List<String> sourceEventCode) {
        this.sourceEventCode = sourceEventCode;
        return this;
    }
    public java.util.List<String> getSourceEventCode() {
        return this.sourceEventCode;
    }

}

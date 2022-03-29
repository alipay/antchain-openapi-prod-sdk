// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ClearOffsetResultDTO extends TeaModel {
    // GroupId
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 操作结果
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    public static ClearOffsetResultDTO build(java.util.Map<String, ?> map) throws Exception {
        ClearOffsetResultDTO self = new ClearOffsetResultDTO();
        return TeaModel.build(map, self);
    }

    public ClearOffsetResultDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ClearOffsetResultDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ClearOffsetResultDTO setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}

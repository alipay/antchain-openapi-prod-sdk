// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SubscriptionDTO extends TeaModel {
    // 订阅该 Topic 的子类别 Tag 表达式
    @NameInMap("sub_string")
    @Validation(required = true)
    public String subString;

    //  订阅关系版本号，为自增 Long 型
    @NameInMap("sub_version")
    @Validation(required = true)
    public Long subVersion;

    // 订阅的 Tag 集合
    @NameInMap("tags_set")
    @Validation(required = true)
    public java.util.List<String> tagsSet;

    // 订阅的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static SubscriptionDTO build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionDTO self = new SubscriptionDTO();
        return TeaModel.build(map, self);
    }

    public SubscriptionDTO setSubString(String subString) {
        this.subString = subString;
        return this;
    }
    public String getSubString() {
        return this.subString;
    }

    public SubscriptionDTO setSubVersion(Long subVersion) {
        this.subVersion = subVersion;
        return this;
    }
    public Long getSubVersion() {
        return this.subVersion;
    }

    public SubscriptionDTO setTagsSet(java.util.List<String> tagsSet) {
        this.tagsSet = tagsSet;
        return this;
    }
    public java.util.List<String> getTagsSet() {
        return this.tagsSet;
    }

    public SubscriptionDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}

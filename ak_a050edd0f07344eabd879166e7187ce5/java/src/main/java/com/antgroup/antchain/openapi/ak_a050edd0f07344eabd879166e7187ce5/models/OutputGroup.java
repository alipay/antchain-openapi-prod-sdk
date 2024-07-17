// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class OutputGroup extends TeaModel {
    // 子节点id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 自节点名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 快捷条件选择类型
    @NameInMap("condition_type")
    @Validation(required = true)
    public String conditionType;

    // 条件表达式
    @NameInMap("condition_config")
    @Validation(required = true)
    public java.util.List<String> conditionConfig;

    // 子节点下的播报内容
    @NameInMap("content_list")
    @Validation(required = true)
    public java.util.List<Output> contentList;

    // 重试播报时的优先级
    @NameInMap("priority")
    @Validation(required = true)
    public Long priority;

    public static OutputGroup build(java.util.Map<String, ?> map) throws Exception {
        OutputGroup self = new OutputGroup();
        return TeaModel.build(map, self);
    }

    public OutputGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OutputGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OutputGroup setConditionType(String conditionType) {
        this.conditionType = conditionType;
        return this;
    }
    public String getConditionType() {
        return this.conditionType;
    }

    public OutputGroup setConditionConfig(java.util.List<String> conditionConfig) {
        this.conditionConfig = conditionConfig;
        return this;
    }
    public java.util.List<String> getConditionConfig() {
        return this.conditionConfig;
    }

    public OutputGroup setContentList(java.util.List<Output> contentList) {
        this.contentList = contentList;
        return this;
    }
    public java.util.List<Output> getContentList() {
        return this.contentList;
    }

    public OutputGroup setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

}

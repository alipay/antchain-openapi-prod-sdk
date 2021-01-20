// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackParamTemplate extends TeaModel {
    // 技术栈版本的id
    @NameInMap("buildpack_id")
    public String buildpackId;

    // 技术栈版本参数的默认值
    @NameInMap("default_value")
    public String defaultValue;

    // 技术栈版本参数的描述
    @NameInMap("description")
    public String description;

    // id
    @NameInMap("id")
    public String id;

    // 技术栈版本参数的key
    @NameInMap("key")
    public String key;

    // 该技术栈版本参数是否是只读的
    @NameInMap("readonly")
    public Boolean readonly;

    // 该技术栈版本参数是否是必须的
    @NameInMap("required")
    public Boolean required;

    public static BuildpackParamTemplate build(java.util.Map<String, ?> map) throws Exception {
        BuildpackParamTemplate self = new BuildpackParamTemplate();
        return TeaModel.build(map, self);
    }

    public BuildpackParamTemplate setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public BuildpackParamTemplate setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public BuildpackParamTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildpackParamTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackParamTemplate setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public BuildpackParamTemplate setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public BuildpackParamTemplate setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}

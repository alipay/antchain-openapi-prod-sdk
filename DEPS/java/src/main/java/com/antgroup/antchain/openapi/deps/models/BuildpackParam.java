// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackParam extends TeaModel {
    // default_value
    @NameInMap("default_value")
    public String defaultValue;

    // key
    @NameInMap("key")
    public String key;

    // readonly
    @NameInMap("readonly")
    public Boolean readonly;

    // required
    @NameInMap("required")
    public Boolean required;

    // description
    @NameInMap("description")
    public String description;

    public static BuildpackParam build(java.util.Map<String, ?> map) throws Exception {
        BuildpackParam self = new BuildpackParam();
        return TeaModel.build(map, self);
    }

    public BuildpackParam setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public BuildpackParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public BuildpackParam setReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }
    public Boolean getReadonly() {
        return this.readonly;
    }

    public BuildpackParam setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public BuildpackParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}

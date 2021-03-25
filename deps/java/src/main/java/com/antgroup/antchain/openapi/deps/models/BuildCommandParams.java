// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildCommandParams extends TeaModel {
    // buildpackId
    @NameInMap("buildpack_id")
    @Validation(required = true)
    public String buildpackId;

    // description
    @NameInMap("description")
    public String description;

    // key
    @NameInMap("key")
    public String key;

    // value
    @NameInMap("value")
    public String value;

    public static BuildCommandParams build(java.util.Map<String, ?> map) throws Exception {
        BuildCommandParams self = new BuildCommandParams();
        return TeaModel.build(map, self);
    }

    public BuildCommandParams setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public BuildCommandParams setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public BuildCommandParams setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public BuildCommandParams setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

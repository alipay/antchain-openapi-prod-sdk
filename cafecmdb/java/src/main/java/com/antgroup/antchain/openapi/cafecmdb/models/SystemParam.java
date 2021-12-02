// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class SystemParam extends TeaModel {
    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value_type
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    // value_json
    @NameInMap("value_json")
    @Validation(required = true)
    public String valueJson;

    // group_name
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    public static SystemParam build(java.util.Map<String, ?> map) throws Exception {
        SystemParam self = new SystemParam();
        return TeaModel.build(map, self);
    }

    public SystemParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SystemParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SystemParam setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public SystemParam setValueJson(String valueJson) {
        this.valueJson = valueJson;
        return this;
    }
    public String getValueJson() {
        return this.valueJson;
    }

    public SystemParam setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

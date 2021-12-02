// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class PushParamRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 更新的键值
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 由于OP不支持MAP，需要使用json字符串
    @NameInMap("value_json")
    @Validation(required = true)
    public String valueJson;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // value_type
    @NameInMap("value_type")
    @Validation(required = true)
    public String valueType;

    // 参数分组
    @NameInMap("group_name")
    @Validation(required = true)
    public String groupName;

    public static PushParamRequest build(java.util.Map<String, ?> map) throws Exception {
        PushParamRequest self = new PushParamRequest();
        return TeaModel.build(map, self);
    }

    public PushParamRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushParamRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PushParamRequest setValueJson(String valueJson) {
        this.valueJson = valueJson;
        return this;
    }
    public String getValueJson() {
        return this.valueJson;
    }

    public PushParamRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PushParamRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

    public PushParamRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

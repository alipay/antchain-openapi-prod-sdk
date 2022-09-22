// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class JsonPatch extends TeaModel {
    // 操作类型
    @NameInMap("op")
    @Validation(required = true)
    public String op;

    // json path 路径
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 值
    @NameInMap("value")
    public String value;

    // 值类型，默认 string
    @NameInMap("value_type")
    public String valueType;

    public static JsonPatch build(java.util.Map<String, ?> map) throws Exception {
        JsonPatch self = new JsonPatch();
        return TeaModel.build(map, self);
    }

    public JsonPatch setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public JsonPatch setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public JsonPatch setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public JsonPatch setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}

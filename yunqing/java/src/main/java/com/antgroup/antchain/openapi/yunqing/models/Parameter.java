// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Parameter extends TeaModel {
    // 参数默认值
    @NameInMap("default")
    @Validation(required = true)
    public String _default;

    // 参数key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    //  参数描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 参数类型        MANUAL("manual"),
    //         CONSTANT("constant"),
    //         EXPRESSION("expression");
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    // 是否必须
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 参数模版
    @NameInMap("parameters")
    @Validation(required = true)
    public java.util.List<ParameterTemplate> parameters;

    //         STRING("string"),
    //         SECRET("secret"),
    //         INT("int"),
    //         FLOAT("float"),
    //         ANY("any");
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static Parameter build(java.util.Map<String, ?> map) throws Exception {
        Parameter self = new Parameter();
        return TeaModel.build(map, self);
    }

    public Parameter set_default(String _default) {
        this._default = _default;
        return this;
    }
    public String get_default() {
        return this._default;
    }

    public Parameter setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Parameter setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Parameter setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Parameter setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public Parameter setParameters(java.util.List<ParameterTemplate> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<ParameterTemplate> getParameters() {
        return this.parameters;
    }

    public Parameter setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class Input extends TeaModel {
    // 参数唯一id
    @NameInMap("fe_id")
    @Validation(required = true)
    public String feId;

    // 因子的id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 参数的code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 参数的名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数取值
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<String> value;

    // 参数的值类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 是否使用自定义值
    @NameInMap("custom")
    @Validation(required = true)
    public Boolean custom;

    // 是否多选
    @NameInMap("multiple")
    @Validation(required = true)
    public Boolean multiple;

    public static Input build(java.util.Map<String, ?> map) throws Exception {
        Input self = new Input();
        return TeaModel.build(map, self);
    }

    public Input setFeId(String feId) {
        this.feId = feId;
        return this;
    }
    public String getFeId() {
        return this.feId;
    }

    public Input setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Input setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Input setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Input setValue(java.util.List<String> value) {
        this.value = value;
        return this;
    }
    public java.util.List<String> getValue() {
        return this.value;
    }

    public Input setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Input setCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }
    public Boolean getCustom() {
        return this.custom;
    }

    public Input setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }
    public Boolean getMultiple() {
        return this.multiple;
    }

}

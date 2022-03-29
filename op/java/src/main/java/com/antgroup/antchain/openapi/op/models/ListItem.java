// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ListItem extends TeaModel {
    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 结构体名称
    @NameInMap("struct_name")
    public String structName;

    // 参数示例
    @NameInMap("example")
    public String example;

    // 整数最大值
    @NameInMap("maximum")
    public Long maximum;

    // 是否包括最大值
    @NameInMap("exclusive_maximum")
    public Boolean exclusiveMaximum;

    // 最小值
    @NameInMap("minimum")
    public Long minimum;

    // 是否包括最小值
    @NameInMap("exclusive_minimum")
    public Boolean exclusiveMinimum;

    // 最大长度
    @NameInMap("max_length")
    public Long maxLength;

    // 最小长度
    @NameInMap("min_length")
    public Long minLength;

    // 模式
    @NameInMap("pattern")
    public String pattern;

    // 最大元素个数
    @NameInMap("max_items")
    public Long maxItems;

    // 最小元素数目
    @NameInMap("min_items")
    public Long minItems;

    // 枚举类型
    @NameInMap("enum_values")
    public String enumValues;

    public static ListItem build(java.util.Map<String, ?> map) throws Exception {
        ListItem self = new ListItem();
        return TeaModel.build(map, self);
    }

    public ListItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListItem setStructName(String structName) {
        this.structName = structName;
        return this;
    }
    public String getStructName() {
        return this.structName;
    }

    public ListItem setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public ListItem setMaximum(Long maximum) {
        this.maximum = maximum;
        return this;
    }
    public Long getMaximum() {
        return this.maximum;
    }

    public ListItem setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public Boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    public ListItem setMinimum(Long minimum) {
        this.minimum = minimum;
        return this;
    }
    public Long getMinimum() {
        return this.minimum;
    }

    public ListItem setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public Boolean getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    public ListItem setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public ListItem setMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }
    public Long getMinLength() {
        return this.minLength;
    }

    public ListItem setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public ListItem setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Long getMaxItems() {
        return this.maxItems;
    }

    public ListItem setMinItems(Long minItems) {
        this.minItems = minItems;
        return this;
    }
    public Long getMinItems() {
        return this.minItems;
    }

    public ListItem setEnumValues(String enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public String getEnumValues() {
        return this.enumValues;
    }

}

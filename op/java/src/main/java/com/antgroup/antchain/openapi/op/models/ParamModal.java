// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ParamModal extends TeaModel {
    // api meta数据id
    @NameInMap("api_meta_id")
    @Validation(required = true)
    public String apiMetaId;

    // api版本id
    @NameInMap("api_version_id")
    @Validation(required = true)
    public String apiVersionId;

    // 数组参数
    @NameInMap("list_item")
    public java.util.List<ListItem> listItem;

    // 结构体id
    @NameInMap("field_struct_id")
    public String fieldStructId;

    // 结构体名称
    @NameInMap("field_struct_name")
    public String fieldStructName;

    // 参数示例
    @NameInMap("example")
    public String example;

    // 是否必填
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 最大整数长度
    @NameInMap("maximum")
    public Long maximum;

    // 是否包括最大值
    @NameInMap("exclusive_maximum")
    public Boolean exclusiveMaximum;

    // 整数的最小值
    @NameInMap("minimum")
    public Long minimum;

    // 是否排除最小值
    @NameInMap("exclusive_minimum")
    public Boolean exclusiveMinimum;

    // 字符串的最大长度
    @NameInMap("max_length")
    public Long maxLength;

    // 字符串的最小长度
    @NameInMap("min_length")
    public Long minLength;

    // 模式
    @NameInMap("pattern")
    public String pattern;

    // 最大元素数目
    @NameInMap("max_items")
    public Long maxItems;

    // 最小元素数目
    @NameInMap("min_items")
    public Long minItems;

    // 枚举值
    @NameInMap("enum_values")
    public String enumValues;

    // 参数名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 参数特性
    @NameInMap("feature")
    @Validation(required = true)
    public String feature;

    public static ParamModal build(java.util.Map<String, ?> map) throws Exception {
        ParamModal self = new ParamModal();
        return TeaModel.build(map, self);
    }

    public ParamModal setApiMetaId(String apiMetaId) {
        this.apiMetaId = apiMetaId;
        return this;
    }
    public String getApiMetaId() {
        return this.apiMetaId;
    }

    public ParamModal setApiVersionId(String apiVersionId) {
        this.apiVersionId = apiVersionId;
        return this;
    }
    public String getApiVersionId() {
        return this.apiVersionId;
    }

    public ParamModal setListItem(java.util.List<ListItem> listItem) {
        this.listItem = listItem;
        return this;
    }
    public java.util.List<ListItem> getListItem() {
        return this.listItem;
    }

    public ParamModal setFieldStructId(String fieldStructId) {
        this.fieldStructId = fieldStructId;
        return this;
    }
    public String getFieldStructId() {
        return this.fieldStructId;
    }

    public ParamModal setFieldStructName(String fieldStructName) {
        this.fieldStructName = fieldStructName;
        return this;
    }
    public String getFieldStructName() {
        return this.fieldStructName;
    }

    public ParamModal setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public ParamModal setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ParamModal setMaximum(Long maximum) {
        this.maximum = maximum;
        return this;
    }
    public Long getMaximum() {
        return this.maximum;
    }

    public ParamModal setExclusiveMaximum(Boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
        return this;
    }
    public Boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    public ParamModal setMinimum(Long minimum) {
        this.minimum = minimum;
        return this;
    }
    public Long getMinimum() {
        return this.minimum;
    }

    public ParamModal setExclusiveMinimum(Boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
        return this;
    }
    public Boolean getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    public ParamModal setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public ParamModal setMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }
    public Long getMinLength() {
        return this.minLength;
    }

    public ParamModal setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
    public String getPattern() {
        return this.pattern;
    }

    public ParamModal setMaxItems(Long maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Long getMaxItems() {
        return this.maxItems;
    }

    public ParamModal setMinItems(Long minItems) {
        this.minItems = minItems;
        return this;
    }
    public Long getMinItems() {
        return this.minItems;
    }

    public ParamModal setEnumValues(String enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public String getEnumValues() {
        return this.enumValues;
    }

    public ParamModal setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ParamModal setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ParamModal setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ParamModal setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

}

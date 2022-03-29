// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiParamRequest extends TeaModel {
    // api名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // api版本
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    // 参数名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 目标名称
    @NameInMap("target_name")
    public String targetName;

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 链表信息
    @NameInMap("list_item")
    public java.util.List<ListItem> listItem;

    // 参数示例
    @NameInMap("example")
    public String example;

    // 参数描述
    @NameInMap("description")
    public String description;

    // 结构体名称
    @NameInMap("struct_name")
    public String structName;

    // 最大值
    @NameInMap("maximum")
    public Long maximum;

    // 最小值
    @NameInMap("minimum")
    public Long minimum;

    // 最大长度
    @NameInMap("max_length")
    public Long maxLength;

    // 最小长度
    @NameInMap("min_length")
    public Long minLength;

    // 是否必填
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 特性
    @NameInMap("feature")
    @Validation(required = true)
    public String feature;

    public static ApiParamRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiParamRequest self = new ApiParamRequest();
        return TeaModel.build(map, self);
    }

    public ApiParamRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiParamRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ApiParamRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiParamRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ApiParamRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiParamRequest setListItem(java.util.List<ListItem> listItem) {
        this.listItem = listItem;
        return this;
    }
    public java.util.List<ListItem> getListItem() {
        return this.listItem;
    }

    public ApiParamRequest setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public ApiParamRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiParamRequest setStructName(String structName) {
        this.structName = structName;
        return this;
    }
    public String getStructName() {
        return this.structName;
    }

    public ApiParamRequest setMaximum(Long maximum) {
        this.maximum = maximum;
        return this;
    }
    public Long getMaximum() {
        return this.maximum;
    }

    public ApiParamRequest setMinimum(Long minimum) {
        this.minimum = minimum;
        return this;
    }
    public Long getMinimum() {
        return this.minimum;
    }

    public ApiParamRequest setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public ApiParamRequest setMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }
    public Long getMinLength() {
        return this.minLength;
    }

    public ApiParamRequest setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ApiParamRequest setFeature(String feature) {
        this.feature = feature;
        return this;
    }
    public String getFeature() {
        return this.feature;
    }

}

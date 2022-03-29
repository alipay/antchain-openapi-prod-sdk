// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ApiParamInfo extends TeaModel {
    // api名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // api类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 示例
    @NameInMap("example")
    @Validation(required = true)
    public String example;

    // api描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 结构体名称
    @NameInMap("struct_name")
    @Validation(required = true)
    public String structName;

    // 最大数字
    @NameInMap("maximum")
    @Validation(required = true)
    public Long maximum;

    // 最小数字
    @NameInMap("minimum")
    @Validation(required = true)
    public Long minimum;

    // 字符串最大长度
    @NameInMap("max_length")
    @Validation(required = true)
    public Long maxLength;

    // 最小长度
    @NameInMap("min_length")
    @Validation(required = true)
    public Boolean minLength;

    //  是否支持传输文件
    @NameInMap("file_transfer")
    @Validation(required = true)
    public Boolean fileTransfer;

    // 是否为必填字段
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    public static ApiParamInfo build(java.util.Map<String, ?> map) throws Exception {
        ApiParamInfo self = new ApiParamInfo();
        return TeaModel.build(map, self);
    }

    public ApiParamInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApiParamInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiParamInfo setExample(String example) {
        this.example = example;
        return this;
    }
    public String getExample() {
        return this.example;
    }

    public ApiParamInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ApiParamInfo setStructName(String structName) {
        this.structName = structName;
        return this;
    }
    public String getStructName() {
        return this.structName;
    }

    public ApiParamInfo setMaximum(Long maximum) {
        this.maximum = maximum;
        return this;
    }
    public Long getMaximum() {
        return this.maximum;
    }

    public ApiParamInfo setMinimum(Long minimum) {
        this.minimum = minimum;
        return this;
    }
    public Long getMinimum() {
        return this.minimum;
    }

    public ApiParamInfo setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Long getMaxLength() {
        return this.maxLength;
    }

    public ApiParamInfo setMinLength(Boolean minLength) {
        this.minLength = minLength;
        return this;
    }
    public Boolean getMinLength() {
        return this.minLength;
    }

    public ApiParamInfo setFileTransfer(Boolean fileTransfer) {
        this.fileTransfer = fileTransfer;
        return this;
    }
    public Boolean getFileTransfer() {
        return this.fileTransfer;
    }

    public ApiParamInfo setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class TemplateFieldConfigRequest extends TeaModel {
    // 字段拥有者（1个人，2客户，3人资服务商）
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 字段名称（英文：identityName、identityNumber、phoneNumber、positionName、salary、salaryNumber、examineStandard、projectDesc）
    @NameInMap("field_name")
    @Validation(required = true)
    public String fieldName;

    // 字段名称描述（中文名：姓名、身份证号、手机号、职位、薪资、薪数、考核标准、项目描述）
    @NameInMap("field_name_desc")
    @Validation(required = true)
    public String fieldNameDesc;

    // 字段值
    @NameInMap("field_value")
    @Validation(required = true)
    public String fieldValue;

    public static TemplateFieldConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        TemplateFieldConfigRequest self = new TemplateFieldConfigRequest();
        return TeaModel.build(map, self);
    }

    public TemplateFieldConfigRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public TemplateFieldConfigRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public TemplateFieldConfigRequest setFieldNameDesc(String fieldNameDesc) {
        this.fieldNameDesc = fieldNameDesc;
        return this;
    }
    public String getFieldNameDesc() {
        return this.fieldNameDesc;
    }

    public TemplateFieldConfigRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

}

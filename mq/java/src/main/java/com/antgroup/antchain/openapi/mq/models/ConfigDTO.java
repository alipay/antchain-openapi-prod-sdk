// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConfigDTO extends TeaModel {
    // create time
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // modify time
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // operator
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // key
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // 目标名
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // cluster type or broker type
    @NameInMap("target_type")
    @Validation(required = true)
    public Long targetType;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 生效范围
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // 版本号
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    // 删除标志
    @NameInMap("delete_mark")
    @Validation(required = true)
    public String deleteMark;

    public static ConfigDTO build(java.util.Map<String, ?> map) throws Exception {
        ConfigDTO self = new ConfigDTO();
        return TeaModel.build(map, self);
    }

    public ConfigDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ConfigDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ConfigDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ConfigDTO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConfigDTO setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public ConfigDTO setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ConfigDTO setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

    public ConfigDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ConfigDTO setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ConfigDTO setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public ConfigDTO setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark;
        return this;
    }
    public String getDeleteMark() {
        return this.deleteMark;
    }

}

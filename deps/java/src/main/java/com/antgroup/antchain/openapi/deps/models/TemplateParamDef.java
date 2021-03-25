// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class TemplateParamDef extends TeaModel {
    // 数据保密级别，L1,L2,L3
    @NameInMap("data_level")
    @Validation(required = true)
    public String dataLevel;

    // 默认值，表达式解析结果为空时使用
    @NameInMap("default_val")
    public String defaultVal;

    // 是否已删除
    @NameInMap("deleted")
    public Boolean deleted;

    // 参数描述
    @NameInMap("desc")
    public String desc;

    // 参数id
    @NameInMap("id")
    public String id;

    // 参数名
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 版本
    @NameInMap("param_version")
    public Long paramVersion;

    // 参数值类型，CONST/EXPR
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数值，可能是一个常量或者表达式
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    public static TemplateParamDef build(java.util.Map<String, ?> map) throws Exception {
        TemplateParamDef self = new TemplateParamDef();
        return TeaModel.build(map, self);
    }

    public TemplateParamDef setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public TemplateParamDef setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal;
        return this;
    }
    public String getDefaultVal() {
        return this.defaultVal;
    }

    public TemplateParamDef setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public TemplateParamDef setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public TemplateParamDef setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TemplateParamDef setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TemplateParamDef setParamVersion(Long paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }
    public Long getParamVersion() {
        return this.paramVersion;
    }

    public TemplateParamDef setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TemplateParamDef setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public TemplateParamDef setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public TemplateParamDef setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConfigDO extends TeaModel {
    // key
    @NameInMap("property")
    @Validation(required = true)
    public String property;

    // target name
    @NameInMap("target_name")
    @Validation(required = true)
    public String targetName;

    // cluster type or broker type
    @NameInMap("target_type")
    @Validation(required = true)
    public String targetType;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static ConfigDO build(java.util.Map<String, ?> map) throws Exception {
        ConfigDO self = new ConfigDO();
        return TeaModel.build(map, self);
    }

    public ConfigDO setProperty(String property) {
        this.property = property;
        return this;
    }
    public String getProperty() {
        return this.property;
    }

    public ConfigDO setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ConfigDO setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ConfigDO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ConfigDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ConfigDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ConfigDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GlobalParam extends TeaModel {
    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 数据保密等级
    @NameInMap("data_level")
    public String dataLevel;

    // 参数描述
    @NameInMap("desc")
    public String desc;

    // 全局参数 id
    @NameInMap("id")
    public String id;

    // 参数名
    @NameInMap("key")
    public String key;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    // 版本
    @NameInMap("param_version")
    public Long paramVersion;

    // 该参数属于哪个 scope
    @NameInMap("scope")
    public String scope;

    // 该参数在该 scope 中的 id
    @NameInMap("scope_id")
    public String scopeId;

    // 参数值类型
    @NameInMap("type")
    public String type;

    // 参数值
    @NameInMap("value")
    public String value;

    public static GlobalParam build(java.util.Map<String, ?> map) throws Exception {
        GlobalParam self = new GlobalParam();
        return TeaModel.build(map, self);
    }

    public GlobalParam setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GlobalParam setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public GlobalParam setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public GlobalParam setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GlobalParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GlobalParam setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public GlobalParam setParamVersion(Long paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }
    public Long getParamVersion() {
        return this.paramVersion;
    }

    public GlobalParam setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GlobalParam setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public GlobalParam setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GlobalParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

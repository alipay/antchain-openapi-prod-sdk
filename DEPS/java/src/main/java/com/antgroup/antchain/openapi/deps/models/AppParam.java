// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppParam extends TeaModel {
    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 数据保密等级
    @NameInMap("data_level")
    @Validation(required = true)
    public String dataLevel;

    // 参数描述
    @NameInMap("desc")
    public String desc;

    // 应用参数 id
    @NameInMap("id")
    public String id;

    // 参数名
    @NameInMap("key")
    @Validation(required = true)
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
    @Validation(required = true)
    public String scope;

    // 该参数在该 scope 中的 id
    @NameInMap("scope_id")
    @Validation(required = true)
    public String scopeId;

    // 租户 id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数值
    @NameInMap("value")
    public String value;

    public static AppParam build(java.util.Map<String, ?> map) throws Exception {
        AppParam self = new AppParam();
        return TeaModel.build(map, self);
    }

    public AppParam setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppParam setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public AppParam setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public AppParam setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public AppParam setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public AppParam setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public AppParam setParamVersion(Long paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }
    public Long getParamVersion() {
        return this.paramVersion;
    }

    public AppParam setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AppParam setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public AppParam setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppParam setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AppParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

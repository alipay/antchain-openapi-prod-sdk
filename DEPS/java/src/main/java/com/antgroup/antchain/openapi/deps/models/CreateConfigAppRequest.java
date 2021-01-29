// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 数据保密等级
    @NameInMap("data_level")
    @Validation(required = true)
    public String dataLevel;

    // 参数描述
    @NameInMap("desc")
    public String desc;

    // 参数名
    @NameInMap("key")
    @Validation(required = true)
    public String key;

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

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数值
    @NameInMap("value")
    public String value;

    public static CreateConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigAppRequest self = new CreateConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateConfigAppRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateConfigAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateConfigAppRequest setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public CreateConfigAppRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateConfigAppRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateConfigAppRequest setParamVersion(Long paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }
    public Long getParamVersion() {
        return this.paramVersion;
    }

    public CreateConfigAppRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateConfigAppRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public CreateConfigAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateConfigAppRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

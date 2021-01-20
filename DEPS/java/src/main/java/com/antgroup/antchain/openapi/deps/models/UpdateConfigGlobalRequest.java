// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateConfigGlobalRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

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

    // 版本
    @NameInMap("param_version")
    public Long paramVersion;

    // 该参数属于哪个 scope
    @NameInMap("scope")
    public String scope;

    // 该参数在该 scope 中的 id
    @NameInMap("scope_id")
    public String scopeId;

    // 参数类型
    @NameInMap("type")
    public String type;

    // 参数值
    @NameInMap("value")
    public String value;

    public static UpdateConfigGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigGlobalRequest self = new UpdateConfigGlobalRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateConfigGlobalRequest setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public UpdateConfigGlobalRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateConfigGlobalRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateConfigGlobalRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateConfigGlobalRequest setParamVersion(Long paramVersion) {
        this.paramVersion = paramVersion;
        return this;
    }
    public Long getParamVersion() {
        return this.paramVersion;
    }

    public UpdateConfigGlobalRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateConfigGlobalRequest setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public UpdateConfigGlobalRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateConfigGlobalRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

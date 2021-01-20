// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistConfigGlobalRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 全局参数名称，同一个 scope + scopeId 下不能有同名的全局参数
    @NameInMap("key")
    public String key;

    // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    // 作用域类型
    @NameInMap("type")
    public String type;

    public static ExistConfigGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistConfigGlobalRequest self = new ExistConfigGlobalRequest();
        return TeaModel.build(map, self);
    }

    public ExistConfigGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistConfigGlobalRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ExistConfigGlobalRequest setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

    public ExistConfigGlobalRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

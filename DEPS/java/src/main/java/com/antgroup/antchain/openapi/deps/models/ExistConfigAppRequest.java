// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistConfigAppRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 应用参数名称，同一个 appName + scope + scopeId 下不能有同名的应用参数
    @NameInMap("key")
    public String key;

    // 作用域 id 数组，比如作用域类型（type）是 workspace，那么 scopeId 就是 workspace 的 id
    @NameInMap("scope_ids")
    public java.util.List<String> scopeIds;

    // 作用域类型
    @NameInMap("type")
    public String type;

    public static ExistConfigAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistConfigAppRequest self = new ExistConfigAppRequest();
        return TeaModel.build(map, self);
    }

    public ExistConfigAppRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistConfigAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ExistConfigAppRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ExistConfigAppRequest setScopeIds(java.util.List<String> scopeIds) {
        this.scopeIds = scopeIds;
        return this;
    }
    public java.util.List<String> getScopeIds() {
        return this.scopeIds;
    }

    public ExistConfigAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

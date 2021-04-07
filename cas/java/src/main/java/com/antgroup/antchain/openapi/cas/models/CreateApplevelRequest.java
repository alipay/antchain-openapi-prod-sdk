// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateApplevelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用等级
    @NameInMap("level")
    @Validation(required = true)
    public AppLevel level;

    // 占位，因为入参不能只有一个结构体
    @NameInMap("tenant_id")
    public String tenantId;

    public static CreateApplevelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplevelRequest self = new CreateApplevelRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplevelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateApplevelRequest setLevel(AppLevel level) {
        this.level = level;
        return this;
    }
    public AppLevel getLevel() {
        return this.level;
    }

    public CreateApplevelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

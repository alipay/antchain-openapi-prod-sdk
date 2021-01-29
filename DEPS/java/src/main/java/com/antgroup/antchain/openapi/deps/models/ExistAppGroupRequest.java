// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistAppGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 应用分组名称
    @NameInMap("appgroup_name")
    @Validation(required = true)
    public String appgroupName;

    public static ExistAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistAppGroupRequest self = new ExistAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public ExistAppGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExistAppGroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ExistAppGroupRequest setAppgroupName(String appgroupName) {
        this.appgroupName = appgroupName;
        return this;
    }
    public String getAppgroupName() {
        return this.appgroupName;
    }

}

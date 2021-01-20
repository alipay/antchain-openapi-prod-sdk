// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExistAppGroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用分组名称
    @NameInMap("appgroup_name")
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

    public ExistAppGroupRequest setAppgroupName(String appgroupName) {
        this.appgroupName = appgroupName;
        return this;
    }
    public String getAppgroupName() {
        return this.appgroupName;
    }

}

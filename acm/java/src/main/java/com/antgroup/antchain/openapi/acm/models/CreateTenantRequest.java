// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateTenantRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 蚂蚁通行证uid
    @NameInMap("ant_uid")
    @Validation(required = true)
    public String antUid;

    // 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
    @NameInMap("business_owner_id")
    public String businessOwnerId;

    public static CreateTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRequest self = new CreateTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTenantRequest setAntUid(String antUid) {
        this.antUid = antUid;
        return this;
    }
    public String getAntUid() {
        return this.antUid;
    }

    public CreateTenantRequest setBusinessOwnerId(String businessOwnerId) {
        this.businessOwnerId = businessOwnerId;
        return this;
    }
    public String getBusinessOwnerId() {
        return this.businessOwnerId;
    }

}

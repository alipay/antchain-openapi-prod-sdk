// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 蚂蚁通行证uid
    @NameInMap("ant_uid")
    @Validation(required = true)
    public String antUid;

    // 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
    @NameInMap("business_owner_id")
    public String businessOwnerId;

    // 租户名称，如果为空则随机生成
    @NameInMap("name")
    public String name;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // 描述信息
    @NameInMap("description")
    public String description;

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

    public CreateTenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTenantRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}

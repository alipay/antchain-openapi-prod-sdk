// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSecuritygroupPermissionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // PermissionVO
    @NameInMap("permission")
    @Validation(required = true)
    public PermissionVO permission;

    // securityGroupId
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    public static CreateSecuritygroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecuritygroupPermissionRequest self = new CreateSecuritygroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecuritygroupPermissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSecuritygroupPermissionRequest setPermission(PermissionVO permission) {
        this.permission = permission;
        return this;
    }
    public PermissionVO getPermission() {
        return this.permission;
    }

    public CreateSecuritygroupPermissionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteSecuritygroupPermissionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 安全组 paas id
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    // 12345
    @NameInMap("permission_hash")
    @Validation(required = true)
    public String permissionHash;

    public static DeleteSecuritygroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecuritygroupPermissionRequest self = new DeleteSecuritygroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecuritygroupPermissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSecuritygroupPermissionRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

    public DeleteSecuritygroupPermissionRequest setPermissionHash(String permissionHash) {
        this.permissionHash = permissionHash;
        return this;
    }
    public String getPermissionHash() {
        return this.permissionHash;
    }

}

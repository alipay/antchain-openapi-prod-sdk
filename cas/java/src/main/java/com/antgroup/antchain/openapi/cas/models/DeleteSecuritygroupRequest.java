// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 需要删除的 security group id
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    public static DeleteSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecuritygroupRequest self = new DeleteSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSecuritygroupRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

}

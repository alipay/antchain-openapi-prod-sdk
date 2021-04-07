// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 安全组 id
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    public static RemoveSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSecuritygroupRequest self = new RemoveSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveSecuritygroupRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

}

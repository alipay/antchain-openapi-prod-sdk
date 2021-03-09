// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RemoveSecuritygroupInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 安全组 paas id
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    // 要移除的实例序列号
    @NameInMap("instance_sequences")
    @Validation(required = true)
    public java.util.List<String> instanceSequences;

    public static RemoveSecuritygroupInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSecuritygroupInstanceRequest self = new RemoveSecuritygroupInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSecuritygroupInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveSecuritygroupInstanceRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

    public RemoveSecuritygroupInstanceRequest setInstanceSequences(java.util.List<String> instanceSequences) {
        this.instanceSequences = instanceSequences;
        return this;
    }
    public java.util.List<String> getInstanceSequences() {
        return this.instanceSequences;
    }

}

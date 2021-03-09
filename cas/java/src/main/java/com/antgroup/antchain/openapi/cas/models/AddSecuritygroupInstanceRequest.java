// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AddSecuritygroupInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 需向安全组中添加的实例 paas 序列号
    @NameInMap("instance_sequences")
    @Validation(required = true)
    public java.util.List<String> instanceSequences;

    // 安全组 paas id
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    public static AddSecuritygroupInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecuritygroupInstanceRequest self = new AddSecuritygroupInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AddSecuritygroupInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSecuritygroupInstanceRequest setInstanceSequences(java.util.List<String> instanceSequences) {
        this.instanceSequences = instanceSequences;
        return this;
    }
    public java.util.List<String> getInstanceSequences() {
        return this.instanceSequences;
    }

    public AddSecuritygroupInstanceRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

}

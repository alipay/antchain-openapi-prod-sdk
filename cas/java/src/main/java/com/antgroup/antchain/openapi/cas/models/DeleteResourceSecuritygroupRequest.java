// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteResourceSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 安全组ID。
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    // 要删除的安全组所处专有网络的ID
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    public static DeleteResourceSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceSecuritygroupRequest self = new DeleteResourceSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteResourceSecuritygroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DeleteResourceSecuritygroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DeleteResourceSecuritygroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

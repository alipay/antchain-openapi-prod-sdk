// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SecurityGroupParam extends TeaModel {
    // description
    @NameInMap("description")
    public String description;

    // region id
    @NameInMap("region_id")
    public String regionId;

    // security_group_name
    @NameInMap("security_group_name")
    public String securityGroupName;

    // vpc_id
    @NameInMap("vpc_id")
    public String vpcId;

    public static SecurityGroupParam build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroupParam self = new SecurityGroupParam();
        return TeaModel.build(map, self);
    }

    public SecurityGroupParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroupParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SecurityGroupParam setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public SecurityGroupParam setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

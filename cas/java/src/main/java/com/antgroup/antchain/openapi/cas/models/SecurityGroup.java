// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SecurityGroup extends TeaModel {
    // 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为：yyyy-MM-ddThh:mmZ。
    @NameInMap("creation_time")
    @Validation(required = true)
    public String creationTime;

    // 安全组的描述信息。
    @NameInMap("description")
    public String description;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 安全组ID。
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    // 安全组名称。
    @NameInMap("security_group_name")
    @Validation(required = true)
    public String securityGroupName;

    // 安全组所属的专有网络。
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // 安全组入方向规则
    @NameInMap("ingress_rules")
    public java.util.List<SecurityGroupRule> ingressRules;

    // 安全组出方向规则
    @NameInMap("egress_rules")
    public java.util.List<SecurityGroupRule> egressRules;

    public static SecurityGroup build(java.util.Map<String, ?> map) throws Exception {
        SecurityGroup self = new SecurityGroup();
        return TeaModel.build(map, self);
    }

    public SecurityGroup setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public SecurityGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecurityGroup setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SecurityGroup setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SecurityGroup setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public SecurityGroup setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public SecurityGroup setIngressRules(java.util.List<SecurityGroupRule> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getIngressRules() {
        return this.ingressRules;
    }

    public SecurityGroup setEgressRules(java.util.List<SecurityGroupRule> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getEgressRules() {
        return this.egressRules;
    }

}

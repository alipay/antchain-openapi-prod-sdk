// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateResourceSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 安全组描述信息。长度为2~256个英文或中文字符，不能以http://和https://开头。
    // 
    // 默认值：空。
    @NameInMap("description")
    public String description;

    // 安全组入方向规则
    @NameInMap("ingress_rules")
    public java.util.List<SecurityGroupRule> ingressRules;

    // 安全组出方向规则
    @NameInMap("egress_rules")
    public java.util.List<SecurityGroupRule> egressRules;

    // 安全组名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以 http://和https://开头。可以包含数字、半角冒号（:）、下划线（_）或者连字符（-）。默认值：空。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 安全组所属地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 安全组所属VPC ID。
    @NameInMap("vpc_id")
    @Validation(required = true)
    public String vpcId;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreateResourceSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceSecuritygroupRequest self = new CreateResourceSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourceSecuritygroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceSecuritygroupRequest setIngressRules(java.util.List<SecurityGroupRule> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getIngressRules() {
        return this.ingressRules;
    }

    public CreateResourceSecuritygroupRequest setEgressRules(java.util.List<SecurityGroupRule> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getEgressRules() {
        return this.egressRules;
    }

    public CreateResourceSecuritygroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceSecuritygroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateResourceSecuritygroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateResourceSecuritygroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}

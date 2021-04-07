// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchcreateResourceIngressrulesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 安全组入口规则
    @NameInMap("ingress_rules")
    @Validation(required = true)
    public java.util.List<SecurityGroupRule> ingressRules;

    // region identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 安全组id
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    public static BatchcreateResourceIngressrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateResourceIngressrulesRequest self = new BatchcreateResourceIngressrulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateResourceIngressrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateResourceIngressrulesRequest setIngressRules(java.util.List<SecurityGroupRule> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getIngressRules() {
        return this.ingressRules;
    }

    public BatchcreateResourceIngressrulesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BatchcreateResourceIngressrulesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}

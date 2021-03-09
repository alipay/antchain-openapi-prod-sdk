// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BatchcreateResourceEgressrulesRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 安全组出方向规则
    @NameInMap("egress_rules")
    @Validation(required = true)
    public java.util.List<SecurityGroupRule> egressRules;

    // region identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 安全组id
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    public static BatchcreateResourceEgressrulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateResourceEgressrulesRequest self = new BatchcreateResourceEgressrulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateResourceEgressrulesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateResourceEgressrulesRequest setEgressRules(java.util.List<SecurityGroupRule> egressRules) {
        this.egressRules = egressRules;
        return this;
    }
    public java.util.List<SecurityGroupRule> getEgressRules() {
        return this.egressRules;
    }

    public BatchcreateResourceEgressrulesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public BatchcreateResourceEgressrulesRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

}

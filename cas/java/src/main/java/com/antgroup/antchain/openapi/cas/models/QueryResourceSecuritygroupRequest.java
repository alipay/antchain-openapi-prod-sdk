// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceSecuritygroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // disable cache
    @NameInMap("disable_cache")
    public Boolean disableCache;

    // 地域identity
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 安全组ID。
    @NameInMap("security_group_id")
    public String securityGroupId;

    // 安全组所在的专有网络ID。
    @NameInMap("vpc_id")
    public String vpcId;

    public static QueryResourceSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceSecuritygroupRequest self = new QueryResourceSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceSecuritygroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourceSecuritygroupRequest setDisableCache(Boolean disableCache) {
        this.disableCache = disableCache;
        return this;
    }
    public Boolean getDisableCache() {
        return this.disableCache;
    }

    public QueryResourceSecuritygroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryResourceSecuritygroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public QueryResourceSecuritygroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

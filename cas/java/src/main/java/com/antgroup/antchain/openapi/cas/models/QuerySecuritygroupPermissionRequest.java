// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QuerySecuritygroupPermissionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // securityGroupId
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    // autoRefresh
    @NameInMap("auto_refresh")
    public Boolean autoRefresh;

    // nicType
    @NameInMap("nic_type")
    public String nicType;

    // direction
    @NameInMap("direction")
    public String direction;

    public static QuerySecuritygroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecuritygroupPermissionRequest self = new QuerySecuritygroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecuritygroupPermissionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecuritygroupPermissionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public QuerySecuritygroupPermissionRequest setAutoRefresh(Boolean autoRefresh) {
        this.autoRefresh = autoRefresh;
        return this;
    }
    public Boolean getAutoRefresh() {
        return this.autoRefresh;
    }

    public QuerySecuritygroupPermissionRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public QuerySecuritygroupPermissionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}

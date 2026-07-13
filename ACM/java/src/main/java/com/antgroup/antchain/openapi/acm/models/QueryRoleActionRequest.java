// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryRoleActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 角色ID
    @NameInMap("role_id")
    public String roleId;

    // 角色名称，查询时和owner配套使用
    @NameInMap("role_name")
    public String roleName;

    // 角色所有者
    @NameInMap("role_owner")
    public String roleOwner;

    public static QueryRoleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRoleActionRequest self = new QueryRoleActionRequest();
        return TeaModel.build(map, self);
    }

    public QueryRoleActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRoleActionRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public QueryRoleActionRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public QueryRoleActionRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public QueryRoleActionRequest setRoleOwner(String roleOwner) {
        this.roleOwner = roleOwner;
        return this;
    }
    public String getRoleOwner() {
        return this.roleOwner;
    }

}

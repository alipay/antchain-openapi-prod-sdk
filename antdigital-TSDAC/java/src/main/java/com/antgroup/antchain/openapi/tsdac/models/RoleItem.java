// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class RoleItem extends TeaModel {
    // 角色ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    // 角色名称
    /**
     * <strong>example:</strong>
     * <p>Master</p>
     */
    @NameInMap("role_name")
    @Validation(required = true)
    public String roleName;

    public static RoleItem build(java.util.Map<String, ?> map) throws Exception {
        RoleItem self = new RoleItem();
        return TeaModel.build(map, self);
    }

    public RoleItem setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public RoleItem setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}

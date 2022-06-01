// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicRolePermission extends TeaModel {
    // 角色编码
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    // 角色名称
    @NameInMap("role_name")
    @Validation(required = true)
    public String roleName;

    // 权限列表
    @NameInMap("permission_list")
    @Validation(required = true)
    public java.util.List<IotBasicPermissionData> permissionList;

    public static IotBasicRolePermission build(java.util.Map<String, ?> map) throws Exception {
        IotBasicRolePermission self = new IotBasicRolePermission();
        return TeaModel.build(map, self);
    }

    public IotBasicRolePermission setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public IotBasicRolePermission setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public IotBasicRolePermission setPermissionList(java.util.List<IotBasicPermissionData> permissionList) {
        this.permissionList = permissionList;
        return this;
    }
    public java.util.List<IotBasicPermissionData> getPermissionList() {
        return this.permissionList;
    }

}

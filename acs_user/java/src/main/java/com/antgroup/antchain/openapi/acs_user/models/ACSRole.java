// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class ACSRole extends TeaModel {
    // 角色归属产品
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 角色编码
    @NameInMap("product_role")
    @Validation(required = true)
    public String productRole;

    // 角色编码
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    // 角色名称
    @NameInMap("role_name")
    @Validation(required = true)
    public String roleName;

    // 角色描述信息
    @NameInMap("role_description")
    public String roleDescription;

    // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
    @NameInMap("role_type")
    public String roleType;

    public static ACSRole build(java.util.Map<String, ?> map) throws Exception {
        ACSRole self = new ACSRole();
        return TeaModel.build(map, self);
    }

    public ACSRole setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ACSRole setProductRole(String productRole) {
        this.productRole = productRole;
        return this;
    }
    public String getProductRole() {
        return this.productRole;
    }

    public ACSRole setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public ACSRole setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ACSRole setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }
    public String getRoleDescription() {
        return this.roleDescription;
    }

    public ACSRole setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}

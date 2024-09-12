// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class ACSUserRole extends TeaModel {
    // 角色归属产品
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 角色编码
    @NameInMap("product_role")
    @Validation(required = true)
    public String productRole;

    // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
    @NameInMap("role_type")
    @Validation(required = true)
    public String roleType;

    // 角色名称
    @NameInMap("role_name")
    public String roleName;

    // 角色描述信息
    @NameInMap("role_description")
    public String roleDescription;

    // 权限点信息
    @NameInMap("auth_actions")
    public java.util.List<AuthAction> authActions;

    // 角色code
    @NameInMap("role_code")
    public String roleCode;

    // 登陆用户名
    @NameInMap("userid")
    public String userid;

    public static ACSUserRole build(java.util.Map<String, ?> map) throws Exception {
        ACSUserRole self = new ACSUserRole();
        return TeaModel.build(map, self);
    }

    public ACSUserRole setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ACSUserRole setProductRole(String productRole) {
        this.productRole = productRole;
        return this;
    }
    public String getProductRole() {
        return this.productRole;
    }

    public ACSUserRole setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

    public ACSUserRole setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ACSUserRole setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }
    public String getRoleDescription() {
        return this.roleDescription;
    }

    public ACSUserRole setAuthActions(java.util.List<AuthAction> authActions) {
        this.authActions = authActions;
        return this;
    }
    public java.util.List<AuthAction> getAuthActions() {
        return this.authActions;
    }

    public ACSUserRole setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public ACSUserRole setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

}

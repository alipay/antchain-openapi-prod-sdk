// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddUserRoleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账号标识，蚂蚁金融科技租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 权限标识
    //     LEASER(0),
    //     BUYERS(1),
    //     OWNER(2),
    //     ADMIN(9);
    @NameInMap("role")
    @Validation(required = true)
    public String role;

    // 是否支持abm远程
    @NameInMap("support_abm")
    @Validation(required = true)
    public Boolean supportAbm;

    // 是否含税
    @NameInMap("includ_tax")
    @Validation(required = true)
    public Boolean includTax;

    public static AddUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserRoleRequest self = new AddUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public AddUserRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUserRoleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUserRoleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddUserRoleRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AddUserRoleRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AddUserRoleRequest setSupportAbm(Boolean supportAbm) {
        this.supportAbm = supportAbm;
        return this;
    }
    public Boolean getSupportAbm() {
        return this.supportAbm;
    }

    public AddUserRoleRequest setIncludTax(Boolean includTax) {
        this.includTax = includTax;
        return this;
    }
    public Boolean getIncludTax() {
        return this.includTax;
    }

}

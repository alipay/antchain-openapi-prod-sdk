// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    // 企业名称
    @NameInMap("firm_name")
    public String firmName;

    // 蚂蚁金融科技租户ID
    @NameInMap("open_tenant")
    public String openTenant;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    public String roleType;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setFirmName(String firmName) {
        this.firmName = firmName;
        return this;
    }
    public String getFirmName() {
        return this.firmName;
    }

    public Role setOpenTenant(String openTenant) {
        this.openTenant = openTenant;
        return this;
    }
    public String getOpenTenant() {
        return this.openTenant;
    }

    public Role setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}

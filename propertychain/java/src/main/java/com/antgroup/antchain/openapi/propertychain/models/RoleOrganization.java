// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RoleOrganization extends TeaModel {
    // 企业编号
    @NameInMap("company_no")
    @Validation(required = true)
    public String companyNo;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 角色编码
    // 角色编码类型
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    public static RoleOrganization build(java.util.Map<String, ?> map) throws Exception {
        RoleOrganization self = new RoleOrganization();
        return TeaModel.build(map, self);
    }

    public RoleOrganization setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
        return this;
    }
    public String getCompanyNo() {
        return this.companyNo;
    }

    public RoleOrganization setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public RoleOrganization setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

}

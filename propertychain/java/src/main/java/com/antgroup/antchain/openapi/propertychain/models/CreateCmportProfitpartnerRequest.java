// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateCmportProfitpartnerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业编号
    @NameInMap("company_no")
    @Validation(required = true)
    public String companyNo;

    // 企业名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 组织类别
    @NameInMap("organization_category")
    @Validation(required = true)
    public String organizationCategory;

    // 角色编号对应组织信息
    // 组织对应角色编码：
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    @NameInMap("role_organization_list")
    @Validation(required = true)
    public java.util.List<RoleOrganization> roleOrganizationList;

    public static CreateCmportProfitpartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmportProfitpartnerRequest self = new CreateCmportProfitpartnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmportProfitpartnerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCmportProfitpartnerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCmportProfitpartnerRequest setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
        return this;
    }
    public String getCompanyNo() {
        return this.companyNo;
    }

    public CreateCmportProfitpartnerRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateCmportProfitpartnerRequest setOrganizationCategory(String organizationCategory) {
        this.organizationCategory = organizationCategory;
        return this;
    }
    public String getOrganizationCategory() {
        return this.organizationCategory;
    }

    public CreateCmportProfitpartnerRequest setRoleOrganizationList(java.util.List<RoleOrganization> roleOrganizationList) {
        this.roleOrganizationList = roleOrganizationList;
        return this;
    }
    public java.util.List<RoleOrganization> getRoleOrganizationList() {
        return this.roleOrganizationList;
    }

}

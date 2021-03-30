// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateCmportProfitrateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品编号
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 产品类型
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 金融机构编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 金融机构名称
    @NameInMap("financial_name")
    @Validation(required = true)
    public String financialName;

    // 各方分润比例
    // 对应角色编码类型：
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    @NameInMap("role_ratio")
    @Validation(required = true)
    public java.util.List<RoleRatio> roleRatio;

    public static CreateCmportProfitrateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmportProfitrateRequest self = new CreateCmportProfitrateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmportProfitrateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCmportProfitrateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCmportProfitrateRequest setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public CreateCmportProfitrateRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateCmportProfitrateRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateCmportProfitrateRequest setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public CreateCmportProfitrateRequest setFinancialName(String financialName) {
        this.financialName = financialName;
        return this;
    }
    public String getFinancialName() {
        return this.financialName;
    }

    public CreateCmportProfitrateRequest setRoleRatio(java.util.List<RoleRatio> roleRatio) {
        this.roleRatio = roleRatio;
        return this;
    }
    public java.util.List<RoleRatio> getRoleRatio() {
        return this.roleRatio;
    }

}

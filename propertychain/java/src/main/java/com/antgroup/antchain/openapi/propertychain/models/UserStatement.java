// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UserStatement extends TeaModel {
    // 融资编号
    @NameInMap("financing_no")
    @Validation(required = true)
    public String financingNo;

    // 产品编号，有的话返回
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 融资金额
    @NameInMap("financial_amount")
    @Validation(required = true)
    public Long financialAmount;

    // 分润比例，保留两位小数的百分比
    @NameInMap("profit_rate")
    @Validation(required = true)
    public String profitRate;

    // 总分润金额，乘过分润比例
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 角色名称，按上述角色名称约定
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    // 角色对应的企业
    @NameInMap("company_no")
    @Validation(required = true)
    public String companyNo;

    // 记账日期 yyyy-MM-dd
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    public static UserStatement build(java.util.Map<String, ?> map) throws Exception {
        UserStatement self = new UserStatement();
        return TeaModel.build(map, self);
    }

    public UserStatement setFinancingNo(String financingNo) {
        this.financingNo = financingNo;
        return this;
    }
    public String getFinancingNo() {
        return this.financingNo;
    }

    public UserStatement setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public UserStatement setFinancialAmount(Long financialAmount) {
        this.financialAmount = financialAmount;
        return this;
    }
    public Long getFinancialAmount() {
        return this.financialAmount;
    }

    public UserStatement setProfitRate(String profitRate) {
        this.profitRate = profitRate;
        return this;
    }
    public String getProfitRate() {
        return this.profitRate;
    }

    public UserStatement setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public UserStatement setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public UserStatement setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
        return this;
    }
    public String getCompanyNo() {
        return this.companyNo;
    }

    public UserStatement setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

}

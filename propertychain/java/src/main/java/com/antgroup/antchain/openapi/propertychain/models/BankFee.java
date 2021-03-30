// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BankFee extends TeaModel {
    // 融资编号
    @NameInMap("financial_no")
    @Validation(required = true)
    public String financialNo;

    // 产品编号
    @NameInMap("product_no")
    @Validation(required = true)
    public String productNo;

    // 应付银行本金
    @NameInMap("capital_amount")
    @Validation(required = true)
    public Long capitalAmount;

    // 应付银行利息
    @NameInMap("interest_amount")
    @Validation(required = true)
    public Long interestAmount;

    // 应付总金额
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 记账日期 yyyy-MM-dd
    @NameInMap("account_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String accountDate;

    public static BankFee build(java.util.Map<String, ?> map) throws Exception {
        BankFee self = new BankFee();
        return TeaModel.build(map, self);
    }

    public BankFee setFinancialNo(String financialNo) {
        this.financialNo = financialNo;
        return this;
    }
    public String getFinancialNo() {
        return this.financialNo;
    }

    public BankFee setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }
    public String getProductNo() {
        return this.productNo;
    }

    public BankFee setCapitalAmount(Long capitalAmount) {
        this.capitalAmount = capitalAmount;
        return this;
    }
    public Long getCapitalAmount() {
        return this.capitalAmount;
    }

    public BankFee setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public Long getInterestAmount() {
        return this.interestAmount;
    }

    public BankFee setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public BankFee setAccountDate(String accountDate) {
        this.accountDate = accountDate;
        return this;
    }
    public String getAccountDate() {
        return this.accountDate;
    }

}

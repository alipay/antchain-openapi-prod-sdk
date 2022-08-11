// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_3d5ac8b5948b43e7a7b8f62c44a6880f.models;

import com.aliyun.tea.*;

public class HouseMgInfo extends TeaModel {
    // 债权金额，人民币默认单位元，保留两位小数点
    @NameInMap("debt_amount")
    public String debtAmount;

    // 债权金额货币类型，比如：CNY=人民币
    @NameInMap("debt_amount_currency")
    public String debtAmountCurrency;

    // 抵押权人证件号码
    @NameInMap("mortgagee_cert_no")
    public String mortgageeCertNo;

    // 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
    @NameInMap("mortgagee_cert_type")
    public String mortgageeCertType;

    // 抵押权人名称
    @NameInMap("mortgagee_name")
    public String mortgageeName;

    // 履债结束日期
    @NameInMap("debt_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String debtEndDate;

    // 履债起始日期
    @NameInMap("debt_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String debtStartDate;

    // 登记时间
    @NameInMap("registered_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String registeredDate;

    // 房产链内部房产编号
    @NameInMap("house_no")
    public String houseNo;

    public static HouseMgInfo build(java.util.Map<String, ?> map) throws Exception {
        HouseMgInfo self = new HouseMgInfo();
        return TeaModel.build(map, self);
    }

    public HouseMgInfo setDebtAmount(String debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }
    public String getDebtAmount() {
        return this.debtAmount;
    }

    public HouseMgInfo setDebtAmountCurrency(String debtAmountCurrency) {
        this.debtAmountCurrency = debtAmountCurrency;
        return this;
    }
    public String getDebtAmountCurrency() {
        return this.debtAmountCurrency;
    }

    public HouseMgInfo setMortgageeCertNo(String mortgageeCertNo) {
        this.mortgageeCertNo = mortgageeCertNo;
        return this;
    }
    public String getMortgageeCertNo() {
        return this.mortgageeCertNo;
    }

    public HouseMgInfo setMortgageeCertType(String mortgageeCertType) {
        this.mortgageeCertType = mortgageeCertType;
        return this;
    }
    public String getMortgageeCertType() {
        return this.mortgageeCertType;
    }

    public HouseMgInfo setMortgageeName(String mortgageeName) {
        this.mortgageeName = mortgageeName;
        return this;
    }
    public String getMortgageeName() {
        return this.mortgageeName;
    }

    public HouseMgInfo setDebtEndDate(String debtEndDate) {
        this.debtEndDate = debtEndDate;
        return this;
    }
    public String getDebtEndDate() {
        return this.debtEndDate;
    }

    public HouseMgInfo setDebtStartDate(String debtStartDate) {
        this.debtStartDate = debtStartDate;
        return this;
    }
    public String getDebtStartDate() {
        return this.debtStartDate;
    }

    public HouseMgInfo setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
        return this;
    }
    public String getRegisteredDate() {
        return this.registeredDate;
    }

    public HouseMgInfo setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }
    public String getHouseNo() {
        return this.houseNo;
    }

}

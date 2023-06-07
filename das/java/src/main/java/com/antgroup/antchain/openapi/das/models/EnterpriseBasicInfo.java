// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EnterpriseBasicInfo extends TeaModel {
    // 企业状态
    @NameInMap("reg_status")
    public String regStatus;

    // 成立日期(注册日期)
    @NameInMap("establish_time")
    public String establishTime;

    // 注册资本
    @NameInMap("reg_capital")
    public String regCapital;

    // 行业
    @NameInMap("industry")
    public String industry;

    // 主要人员
    @NameInMap("staff_list")
    public java.util.List<EnterpriseStaff> staffList;

    // 法人类型，1-人;2-公司
    @NameInMap("type")
    public String type;

    // 注册资本币种:人民币、美元、欧元等
    @NameInMap("reg_capital_currency")
    public String regCapitalCurrency;

    // 法人姓名
    @NameInMap("legal_person_name")
    public String legalPersonName;

    // 注册号
    @NameInMap("reg_number")
    public String regNumber;

    // 统一社会信用代码
    @NameInMap("credit_code")
    public String creditCode;

    // 企业名
    @NameInMap("name")
    public String name;

    // 企业类型
    @NameInMap("company_org_type")
    public String companyOrgType;

    // 省份简称
    @NameInMap("base")
    public String base;

    public static EnterpriseBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseBasicInfo self = new EnterpriseBasicInfo();
        return TeaModel.build(map, self);
    }

    public EnterpriseBasicInfo setRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }
    public String getRegStatus() {
        return this.regStatus;
    }

    public EnterpriseBasicInfo setEstablishTime(String establishTime) {
        this.establishTime = establishTime;
        return this;
    }
    public String getEstablishTime() {
        return this.establishTime;
    }

    public EnterpriseBasicInfo setRegCapital(String regCapital) {
        this.regCapital = regCapital;
        return this;
    }
    public String getRegCapital() {
        return this.regCapital;
    }

    public EnterpriseBasicInfo setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public EnterpriseBasicInfo setStaffList(java.util.List<EnterpriseStaff> staffList) {
        this.staffList = staffList;
        return this;
    }
    public java.util.List<EnterpriseStaff> getStaffList() {
        return this.staffList;
    }

    public EnterpriseBasicInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EnterpriseBasicInfo setRegCapitalCurrency(String regCapitalCurrency) {
        this.regCapitalCurrency = regCapitalCurrency;
        return this;
    }
    public String getRegCapitalCurrency() {
        return this.regCapitalCurrency;
    }

    public EnterpriseBasicInfo setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public EnterpriseBasicInfo setRegNumber(String regNumber) {
        this.regNumber = regNumber;
        return this;
    }
    public String getRegNumber() {
        return this.regNumber;
    }

    public EnterpriseBasicInfo setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }
    public String getCreditCode() {
        return this.creditCode;
    }

    public EnterpriseBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnterpriseBasicInfo setCompanyOrgType(String companyOrgType) {
        this.companyOrgType = companyOrgType;
        return this;
    }
    public String getCompanyOrgType() {
        return this.companyOrgType;
    }

    public EnterpriseBasicInfo setBase(String base) {
        this.base = base;
        return this;
    }
    public String getBase() {
        return this.base;
    }

}

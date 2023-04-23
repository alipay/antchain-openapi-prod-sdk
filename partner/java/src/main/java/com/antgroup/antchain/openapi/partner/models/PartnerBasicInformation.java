// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerBasicInformation extends TeaModel {
    // 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 企业法人
    @NameInMap("enterprise_legal_person")
    @Validation(required = true)
    public String enterpriseLegalPerson;

    // 注册资本
    @NameInMap("registered_capital")
    @Validation(required = true)
    public String registeredCapital;

    // 人员规模
    @NameInMap("employee_count")
    @Validation(required = true)
    public String employeeCount;

    // 企业注册省份
    @NameInMap("enterprise_register_province")
    @Validation(required = true)
    public String enterpriseRegisterProvince;

    // 企业注册城市
    @NameInMap("enterprise_register_city")
    @Validation(required = true)
    public String enterpriseRegisterCity;

    // 公司官网地址
    @NameInMap("company_url")
    @Validation(required = true)
    public String companyUrl;

    // 是否上市公司
    @NameInMap("listed")
    @Validation(required = true)
    public Boolean listed;

    // 企业简介
    @NameInMap("brief_introduction")
    @Validation(required = true)
    public String briefIntroduction;

    // 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
    @NameInMap("sub_industry")
    public String subIndustry;

    public static PartnerBasicInformation build(java.util.Map<String, ?> map) throws Exception {
        PartnerBasicInformation self = new PartnerBasicInformation();
        return TeaModel.build(map, self);
    }

    public PartnerBasicInformation setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public PartnerBasicInformation setEnterpriseLegalPerson(String enterpriseLegalPerson) {
        this.enterpriseLegalPerson = enterpriseLegalPerson;
        return this;
    }
    public String getEnterpriseLegalPerson() {
        return this.enterpriseLegalPerson;
    }

    public PartnerBasicInformation setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }
    public String getRegisteredCapital() {
        return this.registeredCapital;
    }

    public PartnerBasicInformation setEmployeeCount(String employeeCount) {
        this.employeeCount = employeeCount;
        return this;
    }
    public String getEmployeeCount() {
        return this.employeeCount;
    }

    public PartnerBasicInformation setEnterpriseRegisterProvince(String enterpriseRegisterProvince) {
        this.enterpriseRegisterProvince = enterpriseRegisterProvince;
        return this;
    }
    public String getEnterpriseRegisterProvince() {
        return this.enterpriseRegisterProvince;
    }

    public PartnerBasicInformation setEnterpriseRegisterCity(String enterpriseRegisterCity) {
        this.enterpriseRegisterCity = enterpriseRegisterCity;
        return this;
    }
    public String getEnterpriseRegisterCity() {
        return this.enterpriseRegisterCity;
    }

    public PartnerBasicInformation setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
        return this;
    }
    public String getCompanyUrl() {
        return this.companyUrl;
    }

    public PartnerBasicInformation setListed(Boolean listed) {
        this.listed = listed;
        return this;
    }
    public Boolean getListed() {
        return this.listed;
    }

    public PartnerBasicInformation setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
        return this;
    }
    public String getBriefIntroduction() {
        return this.briefIntroduction;
    }

    public PartnerBasicInformation setSubIndustry(String subIndustry) {
        this.subIndustry = subIndustry;
        return this;
    }
    public String getSubIndustry() {
        return this.subIndustry;
    }

}

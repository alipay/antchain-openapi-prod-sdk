// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyUnderwritingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报价单编号（蚂蚁内部）
    @NameInMap("quotation_no_inner")
    public String quotationNoInner;

    // 承保申请号（保司）
    @NameInMap("insurance_application_no")
    @Validation(required = true)
    public String insuranceApplicationNo;

    // 保司编码
    @NameInMap("insurance_company_no")
    @Validation(required = true)
    public String insuranceCompanyNo;

    // 保险产品编码
    @NameInMap("trustworthy_value_insurance_type_code")
    @Validation(required = true)
    public String trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    @NameInMap("insurance_project_code")
    @Validation(required = true)
    public String insuranceProjectCode;

    // 保司方案代码
    @NameInMap("insurance_options_code")
    @Validation(required = true)
    public String insuranceOptionsCode;

    // 投保人信息(名称、证件号、证件类型)
    @NameInMap("applicant")
    @Validation(required = true)
    public String applicant;

    // 被保人列表(可空)
    @NameInMap("insured_list")
    public String insuredList;

    // 受益人列表(可空)
    @NameInMap("beneficiary_list")
    public String beneficiaryList;

    // 投保标的列表
    @NameInMap("object_list")
    public String objectList;

    // 保险起期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_start")
    @Validation(required = true)
    public String insurancePeriodStart;

    // 保险止期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_end")
    public String insurancePeriodEnd;

    // 保期（天）
    @NameInMap("insurance_period")
    @Validation(required = true)
    public Long insurancePeriod;

    // 申请保额， {
    // 		"cent": 20000,
    // 		"currency": "CNY"
    // 	}
    @NameInMap("applied_insurance_amount")
    @Validation(required = true)
    public String appliedInsuranceAmount;

    // 保费
    @NameInMap("applied_premium")
    @Validation(required = true)
    public String appliedPremium;

    // 保费费率
    @NameInMap("premium_rate")
    @Validation(required = true)
    public String premiumRate;

    // 承保申请的报价相关内容
    @NameInMap("quotation")
    public String quotation;

    public static ApplyUnderwritingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyUnderwritingRequest self = new ApplyUnderwritingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyUnderwritingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyUnderwritingRequest setQuotationNoInner(String quotationNoInner) {
        this.quotationNoInner = quotationNoInner;
        return this;
    }
    public String getQuotationNoInner() {
        return this.quotationNoInner;
    }

    public ApplyUnderwritingRequest setInsuranceApplicationNo(String insuranceApplicationNo) {
        this.insuranceApplicationNo = insuranceApplicationNo;
        return this;
    }
    public String getInsuranceApplicationNo() {
        return this.insuranceApplicationNo;
    }

    public ApplyUnderwritingRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public ApplyUnderwritingRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public ApplyUnderwritingRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public ApplyUnderwritingRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public ApplyUnderwritingRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ApplyUnderwritingRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public ApplyUnderwritingRequest setBeneficiaryList(String beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }
    public String getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public ApplyUnderwritingRequest setObjectList(String objectList) {
        this.objectList = objectList;
        return this;
    }
    public String getObjectList() {
        return this.objectList;
    }

    public ApplyUnderwritingRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public ApplyUnderwritingRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public ApplyUnderwritingRequest setInsurancePeriod(Long insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
        return this;
    }
    public Long getInsurancePeriod() {
        return this.insurancePeriod;
    }

    public ApplyUnderwritingRequest setAppliedInsuranceAmount(String appliedInsuranceAmount) {
        this.appliedInsuranceAmount = appliedInsuranceAmount;
        return this;
    }
    public String getAppliedInsuranceAmount() {
        return this.appliedInsuranceAmount;
    }

    public ApplyUnderwritingRequest setAppliedPremium(String appliedPremium) {
        this.appliedPremium = appliedPremium;
        return this;
    }
    public String getAppliedPremium() {
        return this.appliedPremium;
    }

    public ApplyUnderwritingRequest setPremiumRate(String premiumRate) {
        this.premiumRate = premiumRate;
        return this;
    }
    public String getPremiumRate() {
        return this.premiumRate;
    }

    public ApplyUnderwritingRequest setQuotation(String quotation) {
        this.quotation = quotation;
        return this;
    }
    public String getQuotation() {
        return this.quotation;
    }

}

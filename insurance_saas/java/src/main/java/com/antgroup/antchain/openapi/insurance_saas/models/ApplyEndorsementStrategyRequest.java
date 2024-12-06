// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyEndorsementStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 承保申请编号（蚂蚁内部）
    @NameInMap("insurance_application_no_inner")
    @Validation(required = true)
    public String insuranceApplicationNoInner;

    // 投保人信息(名称、证件号、证件类型)
    @NameInMap("applicant")
    public String applicant;

    // 被保人列表
    @NameInMap("insured_list")
    public String insuredList;

    // 受益人列表
    @NameInMap("beneficiary_list")
    public String beneficiaryList;

    // 投保标的列表
    @NameInMap("object_list")
    public String objectList;

    // 保险起期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_start")
    public String insurancePeriodStart;

    // 保险止期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_end")
    public String insurancePeriodEnd;

    // 保期（天）
    @NameInMap("insurance_period")
    public Long insurancePeriod;

    // 申请保额， { "cent": 20000, "currency": "CNY" }
    @NameInMap("applied_insurance_amount")
    public String appliedInsuranceAmount;

    // 保费， { "cent": 20000, "currency": "CNY" }
    @NameInMap("applied_premium")
    public String appliedPremium;

    // 保费费率
    @NameInMap("premium_rate")
    public String premiumRate;

    public static ApplyEndorsementStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyEndorsementStrategyRequest self = new ApplyEndorsementStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyEndorsementStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyEndorsementStrategyRequest setInsuranceApplicationNoInner(String insuranceApplicationNoInner) {
        this.insuranceApplicationNoInner = insuranceApplicationNoInner;
        return this;
    }
    public String getInsuranceApplicationNoInner() {
        return this.insuranceApplicationNoInner;
    }

    public ApplyEndorsementStrategyRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ApplyEndorsementStrategyRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public ApplyEndorsementStrategyRequest setBeneficiaryList(String beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }
    public String getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public ApplyEndorsementStrategyRequest setObjectList(String objectList) {
        this.objectList = objectList;
        return this;
    }
    public String getObjectList() {
        return this.objectList;
    }

    public ApplyEndorsementStrategyRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public ApplyEndorsementStrategyRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public ApplyEndorsementStrategyRequest setInsurancePeriod(Long insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
        return this;
    }
    public Long getInsurancePeriod() {
        return this.insurancePeriod;
    }

    public ApplyEndorsementStrategyRequest setAppliedInsuranceAmount(String appliedInsuranceAmount) {
        this.appliedInsuranceAmount = appliedInsuranceAmount;
        return this;
    }
    public String getAppliedInsuranceAmount() {
        return this.appliedInsuranceAmount;
    }

    public ApplyEndorsementStrategyRequest setAppliedPremium(String appliedPremium) {
        this.appliedPremium = appliedPremium;
        return this;
    }
    public String getAppliedPremium() {
        return this.appliedPremium;
    }

    public ApplyEndorsementStrategyRequest setPremiumRate(String premiumRate) {
        this.premiumRate = premiumRate;
        return this;
    }
    public String getPremiumRate() {
        return this.premiumRate;
    }

}

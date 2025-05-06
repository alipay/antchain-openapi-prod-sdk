// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyInsureTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // insurance_application_no
    @NameInMap("insurance_application_no")
    @Validation(required = true)
    public String insuranceApplicationNo;

    // insurance_company_no
    @NameInMap("insurance_company_no")
    @Validation(required = true)
    public String insuranceCompanyNo;

    // trustworthy_value_insurance_type_code
    @NameInMap("trustworthy_value_insurance_type_code")
    @Validation(required = true)
    public String trustworthyValueInsuranceTypeCode;

    // insurance_project_code
    @NameInMap("insurance_project_code")
    @Validation(required = true)
    public String insuranceProjectCode;

    // insurance_options_code
    @NameInMap("insurance_options_code")
    @Validation(required = true)
    public String insuranceOptionsCode;

    // applicant
    @NameInMap("applicant")
    @Validation(required = true)
    public String applicant;

    // insured_list
    @NameInMap("insured_list")
    public String insuredList;

    // beneficiary_list
    @NameInMap("beneficiary_list")
    public String beneficiaryList;

    // insurance_period_start
    @NameInMap("insurance_period_start")
    @Validation(required = true)
    public String insurancePeriodStart;

    // insurance_period_end
    @NameInMap("insurance_period_end")
    public String insurancePeriodEnd;

    // applied_insurance_amount
    @NameInMap("applied_insurance_amount")
    @Validation(required = true)
    public String appliedInsuranceAmount;

    // insurance_period
    @NameInMap("insurance_period")
    public String insurancePeriod;

    // insured_object_list
    @NameInMap("insured_object_list")
    public String insuredObjectList;

    public static ApplyInsureTestRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsureTestRequest self = new ApplyInsureTestRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsureTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsureTestRequest setInsuranceApplicationNo(String insuranceApplicationNo) {
        this.insuranceApplicationNo = insuranceApplicationNo;
        return this;
    }
    public String getInsuranceApplicationNo() {
        return this.insuranceApplicationNo;
    }

    public ApplyInsureTestRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public ApplyInsureTestRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public ApplyInsureTestRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public ApplyInsureTestRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public ApplyInsureTestRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ApplyInsureTestRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public ApplyInsureTestRequest setBeneficiaryList(String beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }
    public String getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public ApplyInsureTestRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public ApplyInsureTestRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public ApplyInsureTestRequest setAppliedInsuranceAmount(String appliedInsuranceAmount) {
        this.appliedInsuranceAmount = appliedInsuranceAmount;
        return this;
    }
    public String getAppliedInsuranceAmount() {
        return this.appliedInsuranceAmount;
    }

    public ApplyInsureTestRequest setInsurancePeriod(String insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
        return this;
    }
    public String getInsurancePeriod() {
        return this.insurancePeriod;
    }

    public ApplyInsureTestRequest setInsuredObjectList(String insuredObjectList) {
        this.insuredObjectList = insuredObjectList;
        return this;
    }
    public String getInsuredObjectList() {
        return this.insuredObjectList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyInsureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 投保申请号-外部，业务侧需保证唯一
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

    // 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
    @NameInMap("applicant")
    @Validation(required = true)
    public String applicant;

    // 被保人列表(可空)，json格式参见投保人信息
    @NameInMap("insured_list")
    public String insuredList;

    // 受益人列表(可空)
    @NameInMap("beneficiary_list")
    public String beneficiaryList;

    // 保险起期
    @NameInMap("insurance_period_start")
    @Validation(required = true)
    public String insurancePeriodStart;

    // 保险止期
    @NameInMap("insurance_period_end")
    public String insurancePeriodEnd;

    // 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
    @NameInMap("applied_insurance_amount")
    @Validation(required = true)
    public String appliedInsuranceAmount;

    // 保期，单位：天
    @NameInMap("insurance_period")
    public Long insurancePeriod;

    // 投保标的List，动态字段，根据险种所配置的标的传值
    @NameInMap("insured_object_list")
    public String insuredObjectList;

    public static ApplyInsureRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsureRequest self = new ApplyInsureRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsureRequest setInsuranceApplicationNo(String insuranceApplicationNo) {
        this.insuranceApplicationNo = insuranceApplicationNo;
        return this;
    }
    public String getInsuranceApplicationNo() {
        return this.insuranceApplicationNo;
    }

    public ApplyInsureRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public ApplyInsureRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public ApplyInsureRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public ApplyInsureRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public ApplyInsureRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public ApplyInsureRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public ApplyInsureRequest setBeneficiaryList(String beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }
    public String getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public ApplyInsureRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public ApplyInsureRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public ApplyInsureRequest setAppliedInsuranceAmount(String appliedInsuranceAmount) {
        this.appliedInsuranceAmount = appliedInsuranceAmount;
        return this;
    }
    public String getAppliedInsuranceAmount() {
        return this.appliedInsuranceAmount;
    }

    public ApplyInsureRequest setInsurancePeriod(Long insurancePeriod) {
        this.insurancePeriod = insurancePeriod;
        return this;
    }
    public Long getInsurancePeriod() {
        return this.insurancePeriod;
    }

    public ApplyInsureRequest setInsuredObjectList(String insuredObjectList) {
        this.insuredObjectList = insuredObjectList;
        return this;
    }
    public String getInsuredObjectList() {
        return this.insuredObjectList;
    }

}

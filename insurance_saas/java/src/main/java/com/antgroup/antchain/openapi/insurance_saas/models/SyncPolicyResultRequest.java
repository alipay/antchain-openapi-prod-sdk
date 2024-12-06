// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class SyncPolicyResultRequest extends TeaModel {
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

    // 被保人列表(可空)
    @NameInMap("insured_list")
    public String insuredList;

    // 受益人列表(可空)
    @NameInMap("beneficiary_list")
    public String beneficiaryList;

    // 投保标的List，动态字段，根据险种所配置的标的传值
    @NameInMap("object_list")
    @Validation(required = true)
    public String objectList;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保额，JSON格式
    @NameInMap("insurance_amount")
    @Validation(required = true)
    public String insuranceAmount;

    // 保费,json格式
    // 
    @NameInMap("insurance_premium")
    @Validation(required = true)
    public String insurancePremium;

    // 保险起期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_start")
    @Validation(required = true)
    public String insurancePeriodStart;

    // 保险止期 yyyy-MM-dd HH:mm:ss
    @NameInMap("insurance_period_end")
    @Validation(required = true)
    public String insurancePeriodEnd;

    // 电子保单URL
    @NameInMap("policy_url")
    public String policyUrl;

    public static SyncPolicyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncPolicyResultRequest self = new SyncPolicyResultRequest();
        return TeaModel.build(map, self);
    }

    public SyncPolicyResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncPolicyResultRequest setInsuranceApplicationNo(String insuranceApplicationNo) {
        this.insuranceApplicationNo = insuranceApplicationNo;
        return this;
    }
    public String getInsuranceApplicationNo() {
        return this.insuranceApplicationNo;
    }

    public SyncPolicyResultRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public SyncPolicyResultRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public SyncPolicyResultRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public SyncPolicyResultRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public SyncPolicyResultRequest setApplicant(String applicant) {
        this.applicant = applicant;
        return this;
    }
    public String getApplicant() {
        return this.applicant;
    }

    public SyncPolicyResultRequest setInsuredList(String insuredList) {
        this.insuredList = insuredList;
        return this;
    }
    public String getInsuredList() {
        return this.insuredList;
    }

    public SyncPolicyResultRequest setBeneficiaryList(String beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }
    public String getBeneficiaryList() {
        return this.beneficiaryList;
    }

    public SyncPolicyResultRequest setObjectList(String objectList) {
        this.objectList = objectList;
        return this;
    }
    public String getObjectList() {
        return this.objectList;
    }

    public SyncPolicyResultRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public SyncPolicyResultRequest setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public String getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public SyncPolicyResultRequest setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
        return this;
    }
    public String getInsurancePremium() {
        return this.insurancePremium;
    }

    public SyncPolicyResultRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public SyncPolicyResultRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public SyncPolicyResultRequest setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }
    public String getPolicyUrl() {
        return this.policyUrl;
    }

}

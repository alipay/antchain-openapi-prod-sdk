// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class ApplyClaimRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 报案单号
    @NameInMap("claim_notification_form_no")
    @Validation(required = true)
    public String claimNotificationFormNo;

    // 保单号
    @NameInMap("insurance_policy_no")
    @Validation(required = true)
    public String insurancePolicyNo;

    // 保司编号
    @NameInMap("insurance_company_no")
    @Validation(required = true)
    public String insuranceCompanyNo;

    // 保险产品代码
    @NameInMap("trustworthy_value_insurance_type_code")
    public String trustworthyValueInsuranceTypeCode;

    // 保司项目代码
    @NameInMap("insurance_options_code")
    public String insuranceOptionsCode;

    //  保司项目代码
    @NameInMap("insurance_project_code")
    public String insuranceProjectCode;

    // 出险时间
    @NameInMap("loss_occurred_time")
    @Validation(required = true)
    public String lossOccurredTime;

    // 出险原因
    @NameInMap("loss_occurred_reason")
    @Validation(required = true)
    public String lossOccurredReason;

    // 出险地点
    @NameInMap("loss_occurred_address")
    @Validation(required = true)
    public String lossOccurredAddress;

    // 出险标的列表
    @NameInMap("object_list")
    public String objectList;

    // 报案金额
    @NameInMap("claim_notification_amount_local_currency")
    @Validation(required = true)
    public String claimNotificationAmountLocalCurrency;

    // 报案人
    @NameInMap("reporter")
    @Validation(required = true)
    public String reporter;

    // 报案材料列表
    @NameInMap("material_list")
    public String materialList;

    public static ApplyClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyClaimRequest self = new ApplyClaimRequest();
        return TeaModel.build(map, self);
    }

    public ApplyClaimRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyClaimRequest setClaimNotificationFormNo(String claimNotificationFormNo) {
        this.claimNotificationFormNo = claimNotificationFormNo;
        return this;
    }
    public String getClaimNotificationFormNo() {
        return this.claimNotificationFormNo;
    }

    public ApplyClaimRequest setInsurancePolicyNo(String insurancePolicyNo) {
        this.insurancePolicyNo = insurancePolicyNo;
        return this;
    }
    public String getInsurancePolicyNo() {
        return this.insurancePolicyNo;
    }

    public ApplyClaimRequest setInsuranceCompanyNo(String insuranceCompanyNo) {
        this.insuranceCompanyNo = insuranceCompanyNo;
        return this;
    }
    public String getInsuranceCompanyNo() {
        return this.insuranceCompanyNo;
    }

    public ApplyClaimRequest setTrustworthyValueInsuranceTypeCode(String trustworthyValueInsuranceTypeCode) {
        this.trustworthyValueInsuranceTypeCode = trustworthyValueInsuranceTypeCode;
        return this;
    }
    public String getTrustworthyValueInsuranceTypeCode() {
        return this.trustworthyValueInsuranceTypeCode;
    }

    public ApplyClaimRequest setInsuranceOptionsCode(String insuranceOptionsCode) {
        this.insuranceOptionsCode = insuranceOptionsCode;
        return this;
    }
    public String getInsuranceOptionsCode() {
        return this.insuranceOptionsCode;
    }

    public ApplyClaimRequest setInsuranceProjectCode(String insuranceProjectCode) {
        this.insuranceProjectCode = insuranceProjectCode;
        return this;
    }
    public String getInsuranceProjectCode() {
        return this.insuranceProjectCode;
    }

    public ApplyClaimRequest setLossOccurredTime(String lossOccurredTime) {
        this.lossOccurredTime = lossOccurredTime;
        return this;
    }
    public String getLossOccurredTime() {
        return this.lossOccurredTime;
    }

    public ApplyClaimRequest setLossOccurredReason(String lossOccurredReason) {
        this.lossOccurredReason = lossOccurredReason;
        return this;
    }
    public String getLossOccurredReason() {
        return this.lossOccurredReason;
    }

    public ApplyClaimRequest setLossOccurredAddress(String lossOccurredAddress) {
        this.lossOccurredAddress = lossOccurredAddress;
        return this;
    }
    public String getLossOccurredAddress() {
        return this.lossOccurredAddress;
    }

    public ApplyClaimRequest setObjectList(String objectList) {
        this.objectList = objectList;
        return this;
    }
    public String getObjectList() {
        return this.objectList;
    }

    public ApplyClaimRequest setClaimNotificationAmountLocalCurrency(String claimNotificationAmountLocalCurrency) {
        this.claimNotificationAmountLocalCurrency = claimNotificationAmountLocalCurrency;
        return this;
    }
    public String getClaimNotificationAmountLocalCurrency() {
        return this.claimNotificationAmountLocalCurrency;
    }

    public ApplyClaimRequest setReporter(String reporter) {
        this.reporter = reporter;
        return this;
    }
    public String getReporter() {
        return this.reporter;
    }

    public ApplyClaimRequest setMaterialList(String materialList) {
        this.materialList = materialList;
        return this;
    }
    public String getMaterialList() {
        return this.materialList;
    }

}

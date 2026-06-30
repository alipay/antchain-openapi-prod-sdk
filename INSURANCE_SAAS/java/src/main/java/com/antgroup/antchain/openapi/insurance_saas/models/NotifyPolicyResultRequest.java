// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyPolicyResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 蚂蚁承保申请号
    @NameInMap("insurance_application_no_inner")
    @Validation(required = true)
    public String insuranceApplicationNoInner;

    // 保单号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保额，JSON格式
    @NameInMap("insurance_amount")
    @Validation(required = true)
    public String insuranceAmount;

    // 保费,json格式
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

    public static NotifyPolicyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPolicyResultRequest self = new NotifyPolicyResultRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPolicyResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyPolicyResultRequest setInsuranceApplicationNoInner(String insuranceApplicationNoInner) {
        this.insuranceApplicationNoInner = insuranceApplicationNoInner;
        return this;
    }
    public String getInsuranceApplicationNoInner() {
        return this.insuranceApplicationNoInner;
    }

    public NotifyPolicyResultRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public NotifyPolicyResultRequest setInsuranceAmount(String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }
    public String getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public NotifyPolicyResultRequest setInsurancePremium(String insurancePremium) {
        this.insurancePremium = insurancePremium;
        return this;
    }
    public String getInsurancePremium() {
        return this.insurancePremium;
    }

    public NotifyPolicyResultRequest setInsurancePeriodStart(String insurancePeriodStart) {
        this.insurancePeriodStart = insurancePeriodStart;
        return this;
    }
    public String getInsurancePeriodStart() {
        return this.insurancePeriodStart;
    }

    public NotifyPolicyResultRequest setInsurancePeriodEnd(String insurancePeriodEnd) {
        this.insurancePeriodEnd = insurancePeriodEnd;
        return this;
    }
    public String getInsurancePeriodEnd() {
        return this.insurancePeriodEnd;
    }

    public NotifyPolicyResultRequest setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }
    public String getPolicyUrl() {
        return this.policyUrl;
    }

}

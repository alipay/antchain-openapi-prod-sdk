// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PushAuthInsurancePolicyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 投保人证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 投保人证件类型
    @NameInMap("cert_type")
    public String certType;

    // 投保人的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 保单失效时间
    @NameInMap("effect_end_time")
    @Validation(required = true)
    public String effectEndTime;

    // 保单生效时间
    @NameInMap("effect_start_time")
    @Validation(required = true)
    public String effectStartTime;

    // 投保时间
    @NameInMap("insured_time")
    @Validation(required = true)
    public String insuredTime;

    // 出单时间
    @NameInMap("issue_time")
    @Validation(required = true)
    public String issueTime;

    // 投保人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 保单编号
    @NameInMap("policy_no")
    @Validation(required = true)
    public String policyNo;

    // 保单类型
    @NameInMap("policy_type")
    public String policyType;

    // 产品名称
    @NameInMap("prod_name")
    @Validation(required = true)
    public String prodName;

    // 产品编号
    @NameInMap("prod_no")
    @Validation(required = true)
    public String prodNo;

    // 行为回溯的整体编号
    @NameInMap("user_trace_code")
    @Validation(required = true)
    public String userTraceCode;

    public static PushAuthInsurancePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAuthInsurancePolicyRequest self = new PushAuthInsurancePolicyRequest();
        return TeaModel.build(map, self);
    }

    public PushAuthInsurancePolicyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAuthInsurancePolicyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAuthInsurancePolicyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PushAuthInsurancePolicyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public PushAuthInsurancePolicyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public PushAuthInsurancePolicyRequest setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    public PushAuthInsurancePolicyRequest setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public PushAuthInsurancePolicyRequest setInsuredTime(String insuredTime) {
        this.insuredTime = insuredTime;
        return this;
    }
    public String getInsuredTime() {
        return this.insuredTime;
    }

    public PushAuthInsurancePolicyRequest setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public PushAuthInsurancePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PushAuthInsurancePolicyRequest setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public PushAuthInsurancePolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public PushAuthInsurancePolicyRequest setProdName(String prodName) {
        this.prodName = prodName;
        return this;
    }
    public String getProdName() {
        return this.prodName;
    }

    public PushAuthInsurancePolicyRequest setProdNo(String prodNo) {
        this.prodNo = prodNo;
        return this;
    }
    public String getProdNo() {
        return this.prodNo;
    }

    public PushAuthInsurancePolicyRequest setUserTraceCode(String userTraceCode) {
        this.userTraceCode = userTraceCode;
        return this;
    }
    public String getUserTraceCode() {
        return this.userTraceCode;
    }

}

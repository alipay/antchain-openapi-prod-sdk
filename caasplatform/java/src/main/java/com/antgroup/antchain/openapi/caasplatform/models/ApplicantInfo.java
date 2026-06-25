// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class ApplicantInfo extends TeaModel {
    // 用户类型：PERSON / ENTERPRISE
    /**
     * <strong>example:</strong>
     * <p>PERSON</p>
     */
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件类型：IDENTITY_CARD/SOCIAL_CREDIT_CODE/MTP_HM/FOREIGN_PASSPORT/MTP_TW/ENTERPRISE_REGISTERED_NO
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("cert_doc_type")
    @Validation(required = true)
    public String certDocType;

    // 证件号码
    /**
     * <strong>example:</strong>
     * <p>C1211131</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 是否对证件号码脱敏，默认true
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("applicant_masking")
    public Boolean applicantMasking;

    // 手机号码
    /**
     * <strong>example:</strong>
     * <p>13888888888</p>
     */
    @NameInMap("mobile_no")
    public String mobileNo;

    // 法人姓名
    /**
     * <strong>example:</strong>
     * <p>王五</p>
     */
    @NameInMap("legal_person")
    public String legalPerson;

    // 法人身份证
    /**
     * <strong>example:</strong>
     * <p>C1211131</p>
     */
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 经办人姓名
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("agent")
    public String agent;

    // 经办人身份证
    /**
     * <strong>example:</strong>
     * <p>C1211131</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    public static ApplicantInfo build(java.util.Map<String, ?> map) throws Exception {
        ApplicantInfo self = new ApplicantInfo();
        return TeaModel.build(map, self);
    }

    public ApplicantInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public ApplicantInfo setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public ApplicantInfo setCertDocType(String certDocType) {
        this.certDocType = certDocType;
        return this;
    }
    public String getCertDocType() {
        return this.certDocType;
    }

    public ApplicantInfo setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ApplicantInfo setApplicantMasking(Boolean applicantMasking) {
        this.applicantMasking = applicantMasking;
        return this;
    }
    public Boolean getApplicantMasking() {
        return this.applicantMasking;
    }

    public ApplicantInfo setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public ApplicantInfo setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public ApplicantInfo setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public ApplicantInfo setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public ApplicantInfo setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

}

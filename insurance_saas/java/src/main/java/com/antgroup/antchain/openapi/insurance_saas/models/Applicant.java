// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class Applicant extends TeaModel {
    // 投保人名称
    /**
     * <strong>example:</strong>
     * <p>李三</p>
     */
    @NameInMap("applicant_name")
    @Validation(required = true, maxLength = 32)
    public String applicantName;

    // 投保人证件类型
    /**
     * <strong>example:</strong>
     * <p>01--居民身份证、03--营业执照</p>
     */
    @NameInMap("applicant_card_type")
    @Validation(required = true, maxLength = 32)
    public String applicantCardType;

    // 投保人证件号码
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("applicant_card_code")
    @Validation(required = true, maxLength = 32)
    public String applicantCardCode;

    // 投保人联系方式
    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("applicant_contact_info")
    @Validation(maxLength = 128)
    public String applicantContactInfo;

    public static Applicant build(java.util.Map<String, ?> map) throws Exception {
        Applicant self = new Applicant();
        return TeaModel.build(map, self);
    }

    public Applicant setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }
    public String getApplicantName() {
        return this.applicantName;
    }

    public Applicant setApplicantCardType(String applicantCardType) {
        this.applicantCardType = applicantCardType;
        return this;
    }
    public String getApplicantCardType() {
        return this.applicantCardType;
    }

    public Applicant setApplicantCardCode(String applicantCardCode) {
        this.applicantCardCode = applicantCardCode;
        return this;
    }
    public String getApplicantCardCode() {
        return this.applicantCardCode;
    }

    public Applicant setApplicantContactInfo(String applicantContactInfo) {
        this.applicantContactInfo = applicantContactInfo;
        return this;
    }
    public String getApplicantContactInfo() {
        return this.applicantContactInfo;
    }

}

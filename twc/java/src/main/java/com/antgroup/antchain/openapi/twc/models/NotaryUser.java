// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class NotaryUser extends TeaModel {
    // 用户类型，PERSON或者ENTERPRISE
    /**
     * <strong>example:</strong>
     * <p>PERSON</p>
     */
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 证件类型
    // ● 个人：支持身份证IDENTITY_CARD
    // ● 企业：支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件用户名称
    // ● 个人：身份证姓名
    // ● 企业：企业名称
    /**
     * <strong>example:</strong>
     * <p>小王</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号
    // ● 个人：身份证号
    // ● 企业：社会统一信用代码或企业工商注册号，与证件类型保持一致即可
    /**
     * <strong>example:</strong>
     * <p>12332112312312</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 个人必填，用户手机号码
    /**
     * <strong>example:</strong>
     * <p>18811111111</p>
     */
    @NameInMap("person_mobile_no")
    public String personMobileNo;

    // 企业选填，法人证件类型，仅支持身份证，IDENTITY_CARD
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    // 企业选填，法人身份证姓名
    /**
     * <strong>example:</strong>
     * <p>小李</p>
     */
    @NameInMap("legal_person_cert_name")
    public String legalPersonCertName;

    // 企业选填，法人身份证号
    /**
     * <strong>example:</strong>
     * <p>123123321123</p>
     */
    @NameInMap("legal_person_cert_no")
    public String legalPersonCertNo;

    // 企业选填，法人手机号
    /**
     * <strong>example:</strong>
     * <p>18811111111</p>
     */
    @NameInMap("legal_person_mobile_no")
    public String legalPersonMobileNo;

    // 扩展属性
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    public static NotaryUser build(java.util.Map<String, ?> map) throws Exception {
        NotaryUser self = new NotaryUser();
        return TeaModel.build(map, self);
    }

    public NotaryUser setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public NotaryUser setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public NotaryUser setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public NotaryUser setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public NotaryUser setPersonMobileNo(String personMobileNo) {
        this.personMobileNo = personMobileNo;
        return this;
    }
    public String getPersonMobileNo() {
        return this.personMobileNo;
    }

    public NotaryUser setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

    public NotaryUser setLegalPersonCertName(String legalPersonCertName) {
        this.legalPersonCertName = legalPersonCertName;
        return this;
    }
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    public NotaryUser setLegalPersonCertNo(String legalPersonCertNo) {
        this.legalPersonCertNo = legalPersonCertNo;
        return this;
    }
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
    }

    public NotaryUser setLegalPersonMobileNo(String legalPersonMobileNo) {
        this.legalPersonMobileNo = legalPersonMobileNo;
        return this;
    }
    public String getLegalPersonMobileNo() {
        return this.legalPersonMobileNo;
    }

    public NotaryUser setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}

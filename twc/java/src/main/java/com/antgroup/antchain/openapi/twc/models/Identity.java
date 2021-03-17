// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class Identity extends TeaModel {
    // 经办人姓名，企业认证选填
    @NameInMap("agent")
    public String agent;

    // 经办人身份证，企业认证选填
    @NameInMap("agent_id")
    public String agentId;

    // 用户名称
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 法人姓名，企业认证必选
    @NameInMap("legal_person")
    public String legalPerson;

    // 法人身份证，企业认证必选
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 用户手机号码
    @NameInMap("mobile_no")
    public String mobileNo;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 用户类型，PERSON或者ENTERPRISE
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 经办人证件类型，企业认证选填
    @NameInMap("agent_cert_type")
    public String agentCertType;

    // 法人证件类型，企业认证必选
    @NameInMap("legal_person_cert_type")
    public String legalPersonCertType;

    public static Identity build(java.util.Map<String, ?> map) throws Exception {
        Identity self = new Identity();
        return TeaModel.build(map, self);
    }

    public Identity setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public Identity setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public Identity setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public Identity setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public Identity setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public Identity setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public Identity setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public Identity setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public Identity setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public Identity setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public Identity setAgentCertType(String agentCertType) {
        this.agentCertType = agentCertType;
        return this;
    }
    public String getAgentCertType() {
        return this.agentCertType;
    }

    public Identity setLegalPersonCertType(String legalPersonCertType) {
        this.legalPersonCertType = legalPersonCertType;
        return this;
    }
    public String getLegalPersonCertType() {
        return this.legalPersonCertType;
    }

}

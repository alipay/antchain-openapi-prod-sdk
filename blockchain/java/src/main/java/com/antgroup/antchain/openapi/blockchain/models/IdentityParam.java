// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class IdentityParam extends TeaModel {
    // 经办人姓名
    /**
     * <strong>example:</strong>
     * <p>张某某</p>
     */
    @NameInMap("agent")
    public String agent;

    // 经办人身份证号
    /**
     * <strong>example:</strong>
     * <p>130406200101012832</p>
     */
    @NameInMap("agent_id")
    public String agentId;

    // 用户的姓名
    /**
     * <strong>example:</strong>
     * <p>李明</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 用户的身份证号
    /**
     * <strong>example:</strong>
     * <p>410204200101013716</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户证件类型，目前只支持IDENTITY_CARD
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 法人姓名，企业认证必选
    /**
     * <strong>example:</strong>
     * <p>张某某</p>
     */
    @NameInMap("legal_person")
    public String legalPerson;

    // 法人身份证，企业认证必选
    /**
     * <strong>example:</strong>
     * <p>130406200101010634</p>
     */
    @NameInMap("legal_person_id")
    public String legalPersonId;

    // 手机号码
    /**
     * <strong>example:</strong>
     * <p>18322331111</p>
     */
    @NameInMap("mobile_no")
    public String mobileNo;

    // 扩展属性字段
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    // 用户类型，默认为PERSON
    /**
     * <strong>example:</strong>
     * <p>PERSON,ENTERPRISE</p>
     */
    @NameInMap("user_type")
    public String userType;

    public static IdentityParam build(java.util.Map<String, ?> map) throws Exception {
        IdentityParam self = new IdentityParam();
        return TeaModel.build(map, self);
    }

    public IdentityParam setAgent(String agent) {
        this.agent = agent;
        return this;
    }
    public String getAgent() {
        return this.agent;
    }

    public IdentityParam setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public IdentityParam setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public IdentityParam setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public IdentityParam setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public IdentityParam setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public IdentityParam setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
        return this;
    }
    public String getLegalPersonId() {
        return this.legalPersonId;
    }

    public IdentityParam setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public IdentityParam setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public IdentityParam setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}

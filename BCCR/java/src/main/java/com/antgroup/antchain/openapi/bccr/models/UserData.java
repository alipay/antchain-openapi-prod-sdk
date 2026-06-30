// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class UserData extends TeaModel {
    // 用户账号
    /**
     * <strong>example:</strong>
     * <p>18654362713</p>
     */
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 账号类型
    /**
     * <strong>example:</strong>
     * <p>COPYRIGHT</p>
     */
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 证件名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("cert_name")
    @Validation(required = true)
    public String certName;

    // 证件号码
    /**
     * <strong>example:</strong>
     * <p>11111111111</p>
     */
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 证件类型
    /**
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 联系方式
    /**
     * <strong>example:</strong>
     * <p>186534672712</p>
     */
    @NameInMap("contact_info")
    public String contactInfo;

    // 企业法人
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("legal_person")
    public String legalPerson;

    // 注册时间
    /**
     * <strong>example:</strong>
     * <p>1603162178000</p>
     */
    @NameInMap("reg_time")
    @Validation(required = true)
    public Long regTime;

    // 账号状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 用户类型
    /**
     * <strong>example:</strong>
     * <p>PERSON</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UserData build(java.util.Map<String, ?> map) throws Exception {
        UserData self = new UserData();
        return TeaModel.build(map, self);
    }

    public UserData setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public UserData setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public UserData setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public UserData setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public UserData setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UserData setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }

    public UserData setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public UserData setRegTime(Long regTime) {
        this.regTime = regTime;
        return this;
    }
    public Long getRegTime() {
        return this.regTime;
    }

    public UserData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

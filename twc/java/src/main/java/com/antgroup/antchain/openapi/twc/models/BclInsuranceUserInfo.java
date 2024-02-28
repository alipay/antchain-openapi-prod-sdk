// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclInsuranceUserInfo extends TeaModel {
    // 用户名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 保险用户类型：
    // HOLDER_ORG: 投保人（机构）
    // INSURED_ORG: 被保人（机构）
    // INSURANCE_ORG: 保司（机构）
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 证件号名称:
    // USCC，社会统一信用代码，目前仅支持
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 证件号码
    @NameInMap("id_number")
    @Validation(required = true)
    public String idNumber;

    // 联系地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 联系方式
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 邮件地址
    @NameInMap("mail")
    @Validation(required = true)
    public String mail;

    public static BclInsuranceUserInfo build(java.util.Map<String, ?> map) throws Exception {
        BclInsuranceUserInfo self = new BclInsuranceUserInfo();
        return TeaModel.build(map, self);
    }

    public BclInsuranceUserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public BclInsuranceUserInfo setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public BclInsuranceUserInfo setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public BclInsuranceUserInfo setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public BclInsuranceUserInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public BclInsuranceUserInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BclInsuranceUserInfo setMail(String mail) {
        this.mail = mail;
        return this;
    }
    public String getMail() {
        return this.mail;
    }

}

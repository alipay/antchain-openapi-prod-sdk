// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignOperatorResult extends TeaModel {
    // 签署方UserId
    @NameInMap("sign_user_id")
    @Validation(required = true)
    public String signUserId;

    // 签署方证件号
    @NameInMap("sign_cert_no")
    public String signCertNo;

    // 签署方证件名称
    @NameInMap("sign_cert_name")
    @Validation(required = true)
    public String signCertName;

    // 签署方证件类型
    @NameInMap("sign_cert_type")
    public String signCertType;

    // 是否授权
    @NameInMap("authorized")
    public Long authorized;

    // 授权时间
    @NameInMap("authorize_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String authorizeTime;

    // 授权人证件号码
    @NameInMap("auth_person_cert_no")
    public String authPersonCertNo;

    // 授权人证件名称
    @NameInMap("auth_person_cert_name")
    public String authPersonCertName;

    // 授权人证件类型
    @NameInMap("auth_person_cert_type")
    public String authPersonCertType;

    // 签署失败原因
    @NameInMap("fail_info")
    public String failInfo;

    // SIGNNED
    @NameInMap("status")
    public String status;

    // 签署时间
    @NameInMap("sign_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String signTime;

    // 是否我方公司
    @NameInMap("our_corp")
    public Long ourCorp;

    // 电话联系方式，脱敏显示
    @NameInMap("mobile_number")
    public String mobileNumber;

    // 邮件联系地址，脱敏展示返回
    @NameInMap("email_address")
    public String emailAddress;

    public static CaSignOperatorResult build(java.util.Map<String, ?> map) throws Exception {
        CaSignOperatorResult self = new CaSignOperatorResult();
        return TeaModel.build(map, self);
    }

    public CaSignOperatorResult setSignUserId(String signUserId) {
        this.signUserId = signUserId;
        return this;
    }
    public String getSignUserId() {
        return this.signUserId;
    }

    public CaSignOperatorResult setSignCertNo(String signCertNo) {
        this.signCertNo = signCertNo;
        return this;
    }
    public String getSignCertNo() {
        return this.signCertNo;
    }

    public CaSignOperatorResult setSignCertName(String signCertName) {
        this.signCertName = signCertName;
        return this;
    }
    public String getSignCertName() {
        return this.signCertName;
    }

    public CaSignOperatorResult setSignCertType(String signCertType) {
        this.signCertType = signCertType;
        return this;
    }
    public String getSignCertType() {
        return this.signCertType;
    }

    public CaSignOperatorResult setAuthorized(Long authorized) {
        this.authorized = authorized;
        return this;
    }
    public Long getAuthorized() {
        return this.authorized;
    }

    public CaSignOperatorResult setAuthorizeTime(String authorizeTime) {
        this.authorizeTime = authorizeTime;
        return this;
    }
    public String getAuthorizeTime() {
        return this.authorizeTime;
    }

    public CaSignOperatorResult setAuthPersonCertNo(String authPersonCertNo) {
        this.authPersonCertNo = authPersonCertNo;
        return this;
    }
    public String getAuthPersonCertNo() {
        return this.authPersonCertNo;
    }

    public CaSignOperatorResult setAuthPersonCertName(String authPersonCertName) {
        this.authPersonCertName = authPersonCertName;
        return this;
    }
    public String getAuthPersonCertName() {
        return this.authPersonCertName;
    }

    public CaSignOperatorResult setAuthPersonCertType(String authPersonCertType) {
        this.authPersonCertType = authPersonCertType;
        return this;
    }
    public String getAuthPersonCertType() {
        return this.authPersonCertType;
    }

    public CaSignOperatorResult setFailInfo(String failInfo) {
        this.failInfo = failInfo;
        return this;
    }
    public String getFailInfo() {
        return this.failInfo;
    }

    public CaSignOperatorResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CaSignOperatorResult setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public CaSignOperatorResult setOurCorp(Long ourCorp) {
        this.ourCorp = ourCorp;
        return this;
    }
    public Long getOurCorp() {
        return this.ourCorp;
    }

    public CaSignOperatorResult setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public CaSignOperatorResult setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

}

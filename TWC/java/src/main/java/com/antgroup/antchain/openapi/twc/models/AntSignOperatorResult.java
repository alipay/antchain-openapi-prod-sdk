// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignOperatorResult extends TeaModel {
    // 签署方UserId
    /**
     * <strong>example:</strong>
     * <p>签署方UserId</p>
     */
    @NameInMap("sign_user_id")
    @Validation(required = true)
    public String signUserId;

    // 签署方证件号
    /**
     * <strong>example:</strong>
     * <p>签署方证件号</p>
     */
    @NameInMap("sign_cert_no")
    @Validation(required = true)
    public String signCertNo;

    // 签署方证件名称
    /**
     * <strong>example:</strong>
     * <p>签署方证件名称</p>
     */
    @NameInMap("sign_cert_name")
    @Validation(required = true)
    public String signCertName;

    // 签署方证件类型
    /**
     * <strong>example:</strong>
     * <p>签署方证件类型</p>
     */
    @NameInMap("sign_cert_type")
    @Validation(required = true)
    public String signCertType;

    // 是否授权
    /**
     * <strong>example:</strong>
     * <p>是否授权</p>
     */
    @NameInMap("authorized")
    @Validation(required = true)
    public Long authorized;

    // 授权时间
    /**
     * <strong>example:</strong>
     * <p>授权时间</p>
     */
    @NameInMap("authorize_time")
    public String authorizeTime;

    // 授权人证件号码
    /**
     * <strong>example:</strong>
     * <p>授权人证件号码</p>
     */
    @NameInMap("auth_person_cert_no")
    public String authPersonCertNo;

    // 授权人证件名称
    /**
     * <strong>example:</strong>
     * <p>授权人证件名称</p>
     */
    @NameInMap("auth_person_cert_name")
    public String authPersonCertName;

    // 授权人证件类型
    /**
     * <strong>example:</strong>
     * <p>授权人证件类型</p>
     */
    @NameInMap("auth_person_cert_type")
    public String authPersonCertType;

    // 邮件联系地址
    /**
     * <strong>example:</strong>
     * <p>邮件联系地址</p>
     */
    @NameInMap("email_address")
    public String emailAddress;

    // 电话联系方式
    /**
     * <strong>example:</strong>
     * <p>电话联系方式</p>
     */
    @NameInMap("mobile_number")
    public String mobileNumber;

    // 签署顺序
    @NameInMap("sign_order")
    public Long signOrder;

    // 签署失败原因
    /**
     * <strong>example:</strong>
     * <p>签署失败原因</p>
     */
    @NameInMap("fail_info")
    public String failInfo;

    // 备注
    /**
     * <strong>example:</strong>
     * <p>备注</p>
     */
    @NameInMap("remark")
    public String remark;

    // 是否我方公司
    /**
     * <strong>example:</strong>
     * <p>是否我方公司</p>
     */
    @NameInMap("our_corp")
    public Long ourCorp;

    // 签署状态
    /**
     * <strong>example:</strong>
     * <p>签署状态</p>
     */
    @NameInMap("status")
    public String status;

    // 签署时间
    /**
     * <strong>example:</strong>
     * <p>签署时间</p>
     */
    @NameInMap("sign_time")
    public String signTime;

    // [签署方子类型 企业子类型： BUS：企业 SINGLE：个体工商户 GOV：党政机关 INST：事业单位 COMMON：社会组织 OTHER：其他组织
    /**
     * <strong>example:</strong>
     * <p>[签署方子类型 企业子类型： BUS：企业 SINGLE：个体工商户 GOV：党政机关 INST：事业单位 COMMON：社会组织 OTHER：其他组织</p>
     */
    @NameInMap("sign_sub_type")
    public String signSubType;

    public static AntSignOperatorResult build(java.util.Map<String, ?> map) throws Exception {
        AntSignOperatorResult self = new AntSignOperatorResult();
        return TeaModel.build(map, self);
    }

    public AntSignOperatorResult setSignUserId(String signUserId) {
        this.signUserId = signUserId;
        return this;
    }
    public String getSignUserId() {
        return this.signUserId;
    }

    public AntSignOperatorResult setSignCertNo(String signCertNo) {
        this.signCertNo = signCertNo;
        return this;
    }
    public String getSignCertNo() {
        return this.signCertNo;
    }

    public AntSignOperatorResult setSignCertName(String signCertName) {
        this.signCertName = signCertName;
        return this;
    }
    public String getSignCertName() {
        return this.signCertName;
    }

    public AntSignOperatorResult setSignCertType(String signCertType) {
        this.signCertType = signCertType;
        return this;
    }
    public String getSignCertType() {
        return this.signCertType;
    }

    public AntSignOperatorResult setAuthorized(Long authorized) {
        this.authorized = authorized;
        return this;
    }
    public Long getAuthorized() {
        return this.authorized;
    }

    public AntSignOperatorResult setAuthorizeTime(String authorizeTime) {
        this.authorizeTime = authorizeTime;
        return this;
    }
    public String getAuthorizeTime() {
        return this.authorizeTime;
    }

    public AntSignOperatorResult setAuthPersonCertNo(String authPersonCertNo) {
        this.authPersonCertNo = authPersonCertNo;
        return this;
    }
    public String getAuthPersonCertNo() {
        return this.authPersonCertNo;
    }

    public AntSignOperatorResult setAuthPersonCertName(String authPersonCertName) {
        this.authPersonCertName = authPersonCertName;
        return this;
    }
    public String getAuthPersonCertName() {
        return this.authPersonCertName;
    }

    public AntSignOperatorResult setAuthPersonCertType(String authPersonCertType) {
        this.authPersonCertType = authPersonCertType;
        return this;
    }
    public String getAuthPersonCertType() {
        return this.authPersonCertType;
    }

    public AntSignOperatorResult setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public AntSignOperatorResult setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public AntSignOperatorResult setSignOrder(Long signOrder) {
        this.signOrder = signOrder;
        return this;
    }
    public Long getSignOrder() {
        return this.signOrder;
    }

    public AntSignOperatorResult setFailInfo(String failInfo) {
        this.failInfo = failInfo;
        return this;
    }
    public String getFailInfo() {
        return this.failInfo;
    }

    public AntSignOperatorResult setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AntSignOperatorResult setOurCorp(Long ourCorp) {
        this.ourCorp = ourCorp;
        return this;
    }
    public Long getOurCorp() {
        return this.ourCorp;
    }

    public AntSignOperatorResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AntSignOperatorResult setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public AntSignOperatorResult setSignSubType(String signSubType) {
        this.signSubType = signSubType;
        return this;
    }
    public String getSignSubType() {
        return this.signSubType;
    }

}

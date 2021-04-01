// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPApplyInfo extends TeaModel {
    // 账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 用户名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 支付宝账户
    @NameInMap("alipay_login_name")
    @Validation(required = true)
    public String alipayLoginName;

    // 联系人
    @NameInMap("legal_name")
    @Validation(required = true)
    public String legalName;

    // 联系方式
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    // 角色(1: 版权方 2:商家)
    @NameInMap("role")
    @Validation(required = true)
    public Long role;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 用户的外系统识别Id
    @NameInMap("external_user_id")
    @Validation(required = true)
    public String externalUserId;

    // 外部系统用户名
    @NameInMap("external_user_name")
    @Validation(required = true)
    public String externalUserName;

    // 申请时间(毫秒时间戳)
    @NameInMap("apply_date")
    @Validation(required = true)
    public Long applyDate;

    public static IPApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        IPApplyInfo self = new IPApplyInfo();
        return TeaModel.build(map, self);
    }

    public IPApplyInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public IPApplyInfo setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public IPApplyInfo setAlipayLoginName(String alipayLoginName) {
        this.alipayLoginName = alipayLoginName;
        return this;
    }
    public String getAlipayLoginName() {
        return this.alipayLoginName;
    }

    public IPApplyInfo setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
    public String getLegalName() {
        return this.legalName;
    }

    public IPApplyInfo setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public IPApplyInfo setRole(Long role) {
        this.role = role;
        return this;
    }
    public Long getRole() {
        return this.role;
    }

    public IPApplyInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IPApplyInfo setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public IPApplyInfo setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
        return this;
    }
    public String getExternalUserName() {
        return this.externalUserName;
    }

    public IPApplyInfo setApplyDate(Long applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public Long getApplyDate() {
        return this.applyDate;
    }

}

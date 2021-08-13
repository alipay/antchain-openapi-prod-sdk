// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class AccountSettlementInfo extends TeaModel {
    // 账户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 版权方名字
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS，审核成功
    @NameInMap("settled_status")
    @Validation(required = true)
    public String settledStatus;

    // 版权方联系人名字
    @NameInMap("contact_name")
    public String contactName;

    // 版权方联系人手机
    @NameInMap("contact_mobile")
    public String contactMobile;

    // 版权方联系人手机号
    @NameInMap("contact_phone")
    @Validation(required = true)
    public String contactPhone;

    // 申请入驻时间
    @NameInMap("apply_time")
    @Validation(required = true)
    public Long applyTime;

    public static AccountSettlementInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountSettlementInfo self = new AccountSettlementInfo();
        return TeaModel.build(map, self);
    }

    public AccountSettlementInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AccountSettlementInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountSettlementInfo setSettledStatus(String settledStatus) {
        this.settledStatus = settledStatus;
        return this;
    }
    public String getSettledStatus() {
        return this.settledStatus;
    }

    public AccountSettlementInfo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public AccountSettlementInfo setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
        return this;
    }
    public String getContactMobile() {
        return this.contactMobile;
    }

    public AccountSettlementInfo setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }
    public String getContactPhone() {
        return this.contactPhone;
    }

    public AccountSettlementInfo setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
        return this;
    }
    public Long getApplyTime() {
        return this.applyTime;
    }

}

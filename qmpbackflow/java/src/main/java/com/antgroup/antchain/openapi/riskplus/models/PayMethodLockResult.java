// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PayMethodLockResult extends TeaModel {
    // 签约结果
    @NameInMap("sign_status")
    @Validation(required = true)
    public String signStatus;

    // 账号
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 登录号
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 支付公司
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 绑定账号名称
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    public static PayMethodLockResult build(java.util.Map<String, ?> map) throws Exception {
        PayMethodLockResult self = new PayMethodLockResult();
        return TeaModel.build(map, self);
    }

    public PayMethodLockResult setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public PayMethodLockResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PayMethodLockResult setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public PayMethodLockResult setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public PayMethodLockResult setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}

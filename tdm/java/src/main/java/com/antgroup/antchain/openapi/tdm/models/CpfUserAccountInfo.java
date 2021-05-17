// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfUserAccountInfo extends TeaModel {
    // 账户状态
    @NameInMap("account_status")
    @Validation(required = true)
    public String accountStatus;

    // 账户余额
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 缴纳单位名称
    @NameInMap("inst_name")
    @Validation(required = true)
    public String instName;

    // 个人账户
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static CpfUserAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        CpfUserAccountInfo self = new CpfUserAccountInfo();
        return TeaModel.build(map, self);
    }

    public CpfUserAccountInfo setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public CpfUserAccountInfo setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public CpfUserAccountInfo setInstName(String instName) {
        this.instName = instName;
        return this;
    }
    public String getInstName() {
        return this.instName;
    }

    public CpfUserAccountInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}

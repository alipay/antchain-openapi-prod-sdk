// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class AccountDTO extends TeaModel {
    // 账号
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 户名
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 开户网点
    @NameInMap("offical_name")
    public String officalName;

    // 联行号
    @NameInMap("offical_number")
    public String officalNumber;

    public static AccountDTO build(java.util.Map<String, ?> map) throws Exception {
        AccountDTO self = new AccountDTO();
        return TeaModel.build(map, self);
    }

    public AccountDTO setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public AccountDTO setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountDTO setOfficalName(String officalName) {
        this.officalName = officalName;
        return this;
    }
    public String getOfficalName() {
        return this.officalName;
    }

    public AccountDTO setOfficalNumber(String officalNumber) {
        this.officalNumber = officalNumber;
        return this;
    }
    public String getOfficalNumber() {
        return this.officalNumber;
    }

}

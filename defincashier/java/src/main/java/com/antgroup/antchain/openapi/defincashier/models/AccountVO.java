// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.defincashier.models;

import com.aliyun.tea.*;

public class AccountVO extends TeaModel {
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
    @Validation(required = true)
    public String officalName;

    // 联行号
    @NameInMap("offical_number")
    @Validation(required = true)
    public String officalNumber;

    // 账号状态
    // 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 分类 BUYER付款账户； SELLER收款账户
    @NameInMap("category")
    public java.util.List<String> category;

    // 上次支付是否失败
    @NameInMap("last_pay_fail")
    public Boolean lastPayFail;

    // 支付方式 BALANCE余额账户；BILL票据账户
    @NameInMap("pay_method")
    public java.util.List<String> payMethod;

    // 账户类型 MAIN 对公账户；ECOLLECTION e收宝
    @NameInMap("type")
    public String type;

    public static AccountVO build(java.util.Map<String, ?> map) throws Exception {
        AccountVO self = new AccountVO();
        return TeaModel.build(map, self);
    }

    public AccountVO setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public AccountVO setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AccountVO setOfficalName(String officalName) {
        this.officalName = officalName;
        return this;
    }
    public String getOfficalName() {
        return this.officalName;
    }

    public AccountVO setOfficalNumber(String officalNumber) {
        this.officalNumber = officalNumber;
        return this;
    }
    public String getOfficalNumber() {
        return this.officalNumber;
    }

    public AccountVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccountVO setCategory(java.util.List<String> category) {
        this.category = category;
        return this;
    }
    public java.util.List<String> getCategory() {
        return this.category;
    }

    public AccountVO setLastPayFail(Boolean lastPayFail) {
        this.lastPayFail = lastPayFail;
        return this;
    }
    public Boolean getLastPayFail() {
        return this.lastPayFail;
    }

    public AccountVO setPayMethod(java.util.List<String> payMethod) {
        this.payMethod = payMethod;
        return this;
    }
    public java.util.List<String> getPayMethod() {
        return this.payMethod;
    }

    public AccountVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

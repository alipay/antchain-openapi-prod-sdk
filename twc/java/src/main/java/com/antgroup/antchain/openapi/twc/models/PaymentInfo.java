// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PaymentInfo extends TeaModel {
    // 收款账户-户名 不超过64字符
    /**
     * <strong>example:</strong>
     * <p>XX</p>
     */
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 收款账户-开户银行 不超过64字符
    /**
     * <strong>example:</strong>
     * <p>xx银行</p>
     */
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 收款账户-收款账户银行账号 不超过64字符
    /**
     * <strong>example:</strong>
     * <p>622848XXX1232123</p>
     */
    @NameInMap("bank_num")
    @Validation(required = true)
    public String bankNum;

    public static PaymentInfo build(java.util.Map<String, ?> map) throws Exception {
        PaymentInfo self = new PaymentInfo();
        return TeaModel.build(map, self);
    }

    public PaymentInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public PaymentInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public PaymentInfo setBankNum(String bankNum) {
        this.bankNum = bankNum;
        return this;
    }
    public String getBankNum() {
        return this.bankNum;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Provision extends TeaModel {
    // 授信上限
    @NameInMap("credit_max")
    @Validation(required = true)
    public String creditMax;

    // 授信已使用
    @NameInMap("credit_used")
    @Validation(required = true)
    public String creditUsed;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 余额
    @NameInMap("debit")
    @Validation(required = true)
    public String debit;

    public static Provision build(java.util.Map<String, ?> map) throws Exception {
        Provision self = new Provision();
        return TeaModel.build(map, self);
    }

    public Provision setCreditMax(String creditMax) {
        this.creditMax = creditMax;
        return this;
    }
    public String getCreditMax() {
        return this.creditMax;
    }

    public Provision setCreditUsed(String creditUsed) {
        this.creditUsed = creditUsed;
        return this;
    }
    public String getCreditUsed() {
        return this.creditUsed;
    }

    public Provision setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Provision setDebit(String debit) {
        this.debit = debit;
        return this;
    }
    public String getDebit() {
        return this.debit;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoney extends TeaModel {
    // 金额，以分为单位
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("cent")
    @Validation(required = true)
    public String cent;

    // 币种编码
    /**
     * <strong>example:</strong>
     * <p>HKD</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 金额，以元为单位，保留6位小数
    /**
     * <strong>example:</strong>
     * <p>1.000000</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static MultiCurrencyMoney build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoney self = new MultiCurrencyMoney();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoney setCent(String cent) {
        this.cent = cent;
        return this;
    }
    public String getCent() {
        return this.cent;
    }

    public MultiCurrencyMoney setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public MultiCurrencyMoney setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}

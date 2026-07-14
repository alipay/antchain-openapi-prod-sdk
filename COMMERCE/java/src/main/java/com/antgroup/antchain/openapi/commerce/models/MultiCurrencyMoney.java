// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoney extends TeaModel {
    // 金额，以分为单位
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("cent")
    @Validation(required = true)
    public Long cent;

    // 币种代码
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency_code")
    @Validation(required = true)
    public String currencyCode;

    public static MultiCurrencyMoney build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoney self = new MultiCurrencyMoney();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoney setCent(Long cent) {
        this.cent = cent;
        return this;
    }
    public Long getCent() {
        return this.cent;
    }

    public MultiCurrencyMoney setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

}

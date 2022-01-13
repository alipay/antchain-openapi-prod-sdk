// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class MultiCurrencyMoneyOpenApi extends TeaModel {
    // 最小币种单位
    @NameInMap("cent")
    @Validation(required = true)
    public String cent;

    // 币种
    @NameInMap("currency_value")
    @Validation(required = true)
    public String currencyValue;

    public static MultiCurrencyMoneyOpenApi build(java.util.Map<String, ?> map) throws Exception {
        MultiCurrencyMoneyOpenApi self = new MultiCurrencyMoneyOpenApi();
        return TeaModel.build(map, self);
    }

    public MultiCurrencyMoneyOpenApi setCent(String cent) {
        this.cent = cent;
        return this;
    }
    public String getCent() {
        return this.cent;
    }

    public MultiCurrencyMoneyOpenApi setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
    public String getCurrencyValue() {
        return this.currencyValue;
    }

}

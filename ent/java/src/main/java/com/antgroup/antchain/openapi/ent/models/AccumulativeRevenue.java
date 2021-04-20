// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class AccumulativeRevenue extends TeaModel {
    // 币种，当前仅支持 CNY
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 金额，单位为分
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static AccumulativeRevenue build(java.util.Map<String, ?> map) throws Exception {
        AccumulativeRevenue self = new AccumulativeRevenue();
        return TeaModel.build(map, self);
    }

    public AccumulativeRevenue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public AccumulativeRevenue setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}

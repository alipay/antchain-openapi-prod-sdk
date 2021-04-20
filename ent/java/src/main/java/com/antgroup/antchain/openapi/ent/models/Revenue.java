// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class Revenue extends TeaModel {
    // 收益币种，目前仅支持CNY
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 收益金额，单位为分
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static Revenue build(java.util.Map<String, ?> map) throws Exception {
        Revenue self = new Revenue();
        return TeaModel.build(map, self);
    }

    public Revenue setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public Revenue setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}

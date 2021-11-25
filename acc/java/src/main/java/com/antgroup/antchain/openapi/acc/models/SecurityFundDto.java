// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class SecurityFundDto extends TeaModel {
    // 保证金类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 金额
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    public static SecurityFundDto build(java.util.Map<String, ?> map) throws Exception {
        SecurityFundDto self = new SecurityFundDto();
        return TeaModel.build(map, self);
    }

    public SecurityFundDto setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SecurityFundDto setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountInfo extends TeaModel {
    // 版通数量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ep_amount")
    @Validation(required = true)
    public Long epAmount;

    // 版通代码
    /**
     * <strong>example:</strong>
     * <p>000111</p>
     */
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    public static AccountInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountInfo self = new AccountInfo();
        return TeaModel.build(map, self);
    }

    public AccountInfo setEpAmount(Long epAmount) {
        this.epAmount = epAmount;
        return this;
    }
    public Long getEpAmount() {
        return this.epAmount;
    }

    public AccountInfo setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ShareInfo extends TeaModel {
    // 商户id
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("merchant_id")
    public String merchantId;

    // 分账金额,整数、单位为分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("amount")
    public String amount;

    public static ShareInfo build(java.util.Map<String, ?> map) throws Exception {
        ShareInfo self = new ShareInfo();
        return TeaModel.build(map, self);
    }

    public ShareInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ShareInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}

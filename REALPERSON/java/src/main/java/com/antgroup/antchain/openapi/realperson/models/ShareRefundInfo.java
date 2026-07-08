// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ShareRefundInfo extends TeaModel {
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

    public static ShareRefundInfo build(java.util.Map<String, ?> map) throws Exception {
        ShareRefundInfo self = new ShareRefundInfo();
        return TeaModel.build(map, self);
    }

    public ShareRefundInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ShareRefundInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

}
